//REDWAN AHMED
//CISC3150 HomeWork 2
//Question 6
// reference https://stackoverflow.com/questions/28766377/how-do-i-use-a-delimiter-in-java-scanner

import java.util.*;
public class CISC3150Q6TokenizeCharacters
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		keyboard.useDelimiter("");
		System.out.println("Please enter a string for tokenization of characters");
		while (keyboard.hasNext())
			System.out.println(keyboard.next());
	}
}
