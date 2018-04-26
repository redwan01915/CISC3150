//REDWAN AHMED
//CISC3150 HW7

// references 
//https://codereview.stackexchange.com/questions/128256/a-simple-command-line-calculator
// https://stackoverflow.com/questions/197986/what-causes-javac-to-issue-the-uses-unchecked-or-unsafe-operations-warning/23908919
//https://www.tutorialspoint.com/javaexamples/exception_stack.htm
//http://www.dreamincode.net/forums/topic/295135-order-of-operations-in-java/


import java.util.Stack;

public class Calculator {

	public static Stack<String> postFixStack = new Stack();

	public static void main(String[] args) {

		try {

			String expression = new String();

			String[] stringContent = new String[args.length + 2];

			stringContent[0] = new String("(");

			stringContent[args.length + 1] = new String(")");

			for (int tempX = 1; tempX < args.length + 1; tempX++) {

				stringContent[tempX] = new String(args[tempX - 1]);

			}

			for (int i = 0; i < stringContent.length; i++) {

				expression += stringContent[i];

			}

			System.out.println(expression);

			makePostfix(stringContent);

			System.out.println(postFixStack);

			System.out.println(solve(postFixStack));

		} catch (Exception e) {

			System.out.println(e);

		}

	}

	public static void makePostfix(String[] tempA)
			throws AlgebraFailException , UserisAdumbassException, QuitMashingOnYourKeyboardException {

		Stack<String> operations = new Stack();

		Stack<String> temporary = new Stack();

		String string = new String();

		for (int i = 0; i < tempA.length; i++) {

			if (tempA[i].equals("+") || tempA[i].equals("-") || tempA[i].equals("*") || tempA[i].equals("/")
					|| tempA[i].equals("%")) {

				if (operations.isEmpty()) {

					operations.add(tempA[i]);

				}

				else {

					if (precedence(operations.peek()) > precedence(tempA[i]) && !operations.peek().equals("(")) {

						temporary.add(operations.pop());

						operations.add(tempA[i]);

					}

					else {

						operations.add(tempA[i]);

					}

				}

			}

			else if (tempA[i].equals("(")) {

				operations.add(tempA[i]);

			}

			else if (tempA[i].equals(")")) {

				boolean isPar = false;

				while (!isPar) {

					if (operations.isEmpty()) {

						throw new UserisAdumbassException("There is an extra Parenthesis in your expression.");

					}

					if (operations.peek().equals("(")) {

						operations.pop();

						isPar = true;

					}

					else {

						temporary.add(operations.pop());

					}

				}

			}

			else {

				char[] test = tempA[i].toCharArray();

				for (int z = 0; z < test.length; z++) {

					if (test[z] == '0' || test[z] == '1' || test[z] == '2' || test[z] == '3' || test[z] == '4'
							|| test[z] == '5' || test[z] == '6' || test[z] == '7' || test[z] == '8' || test[z] == '9') {
					}

					else {

						throw new UserisAdumbassException("There is an illegal term in your expression. \n" +

								"The illegal term is " + tempA[i]);

					}

				}

				temporary.add(tempA[i]);

			}

		}

		while (!temporary.isEmpty()) {

			postFixStack.add(temporary.pop());

		}

		System.out.println("Finish the changing to postfix.");

	}

	public static int precedence(String tempA) {

		if (tempA.equals("+") || tempA.equals("-")) {

			return 0;

		}

		else if (tempA.equals("*") || tempA.equals("/") || tempA.equals("%")) {

			return 1;

		}

		else if (tempA.equals("(") || tempA.equals(")")) {

			return 2;

		}

		else
			return -1;

	}

	public static double add(double tempA, double b) {

		return tempA + b;

	}

	public static double subtract(double tempA, double b) {

		return add(tempA, b * -1);

	}

	public static double multiply(double tempA, double b) {

		return tempA * b;

	}

	public static double divide(double tempA, double b) throws QuitMashingOnYourKeyboardException {

		if (b == 0.0) {

			throw new QuitMashingOnYourKeyboardException("There is tempA division by zero in your expression.\n" +

					"Fix this error to get tempA result.");

		}

		return tempA / b;

	}

	public static double modulo(double tempA, double b) {

		return tempA % b;

	}

	public static double solve(Stack<String> tempA) throws AlgebraFailException, QuitMashingOnYourKeyboardException {

		Stack<String> answer = new Stack();

		Double temporary;

		double one;

		double two;

		while (!postFixStack.isEmpty()) {

			if (precedence(tempA.peek()) == -1) {

				answer.add(tempA.pop());

			} else if (tempA.peek().equals("+")) {

				tempA.pop();

				one = Double.parseDouble(answer.pop());

				two = Double.parseDouble(answer.pop());

				temporary = add(one, two);

				answer.add(temporary.toString());

			} else if (tempA.peek().equals("-")) {

				tempA.pop();

				one = Double.parseDouble(answer.pop());

				two = Double.parseDouble(answer.pop());

				temporary = subtract(two, one);

				answer.add(temporary.toString());

			} else if (tempA.peek().equals("*")) {

				tempA.pop();

				one = Double.parseDouble(answer.pop());

				two = Double.parseDouble(answer.pop());

				temporary = multiply(one, two);

				answer.add(temporary.toString());

			} else if (tempA.peek().equals("/")) {

				tempA.pop();

				one = Double.parseDouble(answer.pop());

				two = Double.parseDouble(answer.pop());

				temporary = divide(two, one);

				answer.add(temporary.toString());

			} else if (tempA.peek().equals("%")) {

				tempA.pop();

				one = Double.parseDouble(answer.pop());

				two = Double.parseDouble(answer.pop());

				temporary = modulo(two, one);

				answer.add(temporary.toString());

			}

		}

		if (answer.size() > 1) {

			throw new AlgebraFailException("Here this is an incomplete expression. \n " +

					"Please Fix the expression and try again.");

		}

		return Double.parseDouble(answer.pop());

	}

}
