// REDWAN AHMED
// Home work 6 :CISC3150HWQ6
// References : https://see.stanford.edu/materials/icspacs106b/H19-RecBacktrackExamples.pdf
//https://www.youtube.com/watch?v=p4_QnaTIxkQ
//https://www.geeksforgeeks.org/backtracking-set-3-n-queen-problem/
// https://stackoverflow.com/questions/35371519/n-queens-puzzle-in-java-with-1d-array
//https://www.youtube.com/watch?v=xouin83ebxE
//https://sadakurapati.wordpress.com/2013/12/10/n-queens-backtracking-algorithm/
// https://developers.google.com/optimization/cp/queens


import java.util.*;
import java.util.Arrays;

public class CISC3150HW6NQueen {
   
   // Here this array will store the results 
    public static int[] N_results; 
	
   // N_result[i]=j; which means the queen at the i-th row and is placed at j-th column.
	// the Queen is placed at (x, y) and (x1,y1)
	// x==x1 means they are in the same rows, y==y1 means they are in the same columns, |x-x1|==|y-y1| means they are placed in the diagonals.
	public boolean it_can_be_placed(int x, int y) {
		// This function will check if queen can be placed (x1,y1), or we can
		// say that if the queen at x1 row is placed at y1 columns.
		// for finding the column for x1 row, we will check all the columns for
		// all the rows till x2-1.
		for (int i = 0; i < x; i++) {
			//result[i] == y => the columns are same
			//|i - x| == |result[i] - y| => in diagonals.
			if ((N_results[i] == y)|| (Math.abs(i - x) == Math.abs(N_results[i] - y))) {
				return false;
			}
		}
		return true;
	}
	public void the_place_of_Queens(int x1, int the_size) {
		for (int i = 0; i < the_size; i++) {
			//this will check if queen at x1th row which can be placed at i-th column.
			if (it_can_be_placed(x1, i)) {
				N_results[x1] = i; // this is the place the queen will stay at this position.
				if (x1 == the_size - 1) {
					System.out.println("The Order of the " + the_size + " queens and number of solutions are "
							+ Arrays.toString(N_results));
				}
				the_place_of_Queens(x1 + 1, the_size);
			}
		}
	}
	public static void main(String[] args) {
		int no_of_queen = 6;
		N_results = new int[no_of_queen];
		CISC3150HW6NQueen i = new CISC3150HW6NQueen();
		i.the_place_of_Queens(0, no_of_queen);
	}
}
