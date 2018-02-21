//REDWAN AHMED
//CISC3150 HomeWork 2
//Question 5
// reference https://stackoverflow.com/questions/28766377/how-do-i-use-a-delimiter-in-java-scanner

import java.util.*;
import java.util.Scanner;
public class CISC3150Q5TokenizeByComma
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
      keyboard.useDelimiter(",");
		System.out.println("Please enter number of strings separated by comma for tokenization");
		while (keyboard.hasNext())
			System.out.println(keyboard.next());
         
	System.exit(0);
 }
}