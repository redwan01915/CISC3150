//REDWAN AHMED
//CISC3150 Homework 5
//Question 1
//Refrence: https://stackoverflow.com/questions/25346042/monte-carlo-simulation-of-pi-in-simple-java
//https://stackoverflow.com/questions/29596225/monte-carlo-simulation
// https://codereview.stackexchange.com/questions/74780/pi-by-monte-carlo
//https://www.geeksforgeeks.org/estimating-value-pi-using-monte-carlo
// http://www.dreamincode.net/forums/topic/30265-calculate-pi-using-random-numbers/


import java.util.*;
import java.util.Random;

public class CISC3150HW5_Q1 {
	public static void main(String[] args) {
    
    long before = System.currentTimeMillis();
	 System.out.println("Start Running Time "+before);	
		
		long number_of_dots_Inside_Circle=0;
		long number_of_dots_Inside_the_Square=0;
		long total_number_of_Dots=0;
		double Ratio_of_the_area;

		// This line will Generates a double between random for x axis
		Random random_m = new Random();	
		// Generates a double between for y axis
      Random random_n = new Random();								
		
		for(total_number_of_Dots = 0; total_number_of_Dots < 4000000000L; total_number_of_Dots++) {
			
		   int m = random_m.nextInt();
			int n = random_n.nextInt();
			
			
			if(m*m + n*n <= 1)									
				number_of_dots_Inside_Circle++;
			else 
				number_of_dots_Inside_the_Square++;
		
      
	}	
		Ratio_of_the_area = (double) number_of_dots_Inside_Circle/total_number_of_Dots;
		
		System.out.println("Number of Dots that hit the circle: " + number_of_dots_Inside_Circle);
		System.out.println("Number of Dots that hit the square: " + number_of_dots_Inside_the_Square);
		System.out.println("The Ratio of areas (PI/4) = " + Ratio_of_the_area);
		System.out.println("The estimated value of PI = 4 X (PI/4): " + 4*Ratio_of_the_area);
      System.out.println(System.currentTimeMillis()-before);
	}
}
