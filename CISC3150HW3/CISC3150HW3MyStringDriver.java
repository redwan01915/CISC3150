// REDWAN AHMED
//CISC3150 Homework 3
//reference https://stackoverflow.com/questions/25954495/alternating-characters-of-two-different-inputs

import java.util.*;
public class CISC3150HW3MyStringDriver {

	public static void main(String[] args) {
		
		char c[] = {'H','e','L','L','o','I'};
		MyString string = new MyString(c);
		MyString str2 = new MyString(c);
		
		System.out.println("Given the original string " + string.toString());
		System.out.println("Has a length of " + string.length());
		System.out.println("Pick a character at index 1 " + string.charAt(1));
		System.out.println("Pick a character at index 2 " + string.charAt(2));
		System.out.println("Pick a character at index 3 " + string.charAt(3));
		System.out.println("Pick a character at index 4 " + string.charAt(4));

		System.out.println("A substring from 3-5 " + string.substring(3, 5));
		
		string.toLowerCase();
		System.out.println("Converting to lowercase " + string.toString());
		string.toUpperCase();
		System.out.println("Converting to uppercase " + string.toString());
		

		string = string.substring(2, 4);
		System.out.println("A substring from 2-4 " + string.toString());
		
		if(string.equals(str2))
			System.out.println("The Strings " + string.toString() + " and " + str2.toString() + " are Equal");
		else
			System.out.println("The Strings " + string.toString() + " and " + str2.toString() + " are not Equal");			
		string = str2;
		if(string.equals(str2))
			System.out.println("The Strings " + string.toString() + " and " + str2.toString() + " are Equal");
		else
			System.out.println("The Strings " + string.toString() + " and " + str2.toString() + " are not Equal");	
				
		System.out.println("The string value of a number is " + string.valueOf(-123456));
		System.out.println("The string value of a number is " + string.valueOf(897));
		System.out.println("The string value of a number is " + string.valueOf(-66323));
		System.out.println("The string value of a number is " + string.valueOf(666));

	}

}