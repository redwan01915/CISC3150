//REDWAN AHMED 
//CISC3150 HWQ#6
//Reference 
import java.util.*;
public class CISC3150HWQ6
{
public static void main(String[] args){

		double A[] = new double[2]; double B[] = new double[2]; double C[] = new double[2];

		Scanner keyboard = new Scanner(System.in);

		System.out.println("The Coordinates of the triangle are:");

		for(int i = 0; i < 3; i++){

			int point = i+1;

			System.out.println("Enter the x coordinate of point " + point + " >");

			switch(i){

			case 0: A[0] = keyboard.nextDouble();

				break;

			case 1: B[0] = keyboard.nextDouble();

				break;

			case 2: C[0] = keyboard.nextDouble();

				break;

			}

			System.out.println("Enter the y coordinate of point " + point + " >");

			switch(i){

			case 0: A[1] = keyboard.nextDouble();

				break;

			case 1: B[1] = keyboard.nextDouble();

				break;

			case 2: C[1] = keyboard.nextDouble();

				break;

			}

		}

		double side1 = Math.sqrt(Math.pow(A[0]-B[0],2)+Math.pow(A[1]-B[1], 2));

		System.out.println(side1+"\n");

		double side2 = Math.sqrt(Math.pow(A[0]-C[0],2)+Math.pow(A[1]-C[1], 2));

		System.out.println(side2+"\n");

		double side3 = Math.sqrt(Math.pow(B[0]-C[0],2)+Math.pow(B[1]-C[1], 2));

		System.out.println(side3+"\n");

		

		if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){

			System.out.println("This IS a real triangle\n");

		}else System.out.println("This is NOT a real triangle\n");

		keyboard.close();
      
      }
      }
