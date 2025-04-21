/* Darshan is very much interested in gardening and hence he plants more trees in his garden. He plants trees in a rectangular fashion
 * with the order of rows and columns and numbers the trees in row wise order. He planted the mango tree in the first row, first column and last 
 * column. So given the tree number(t) and row and column number(n) as the input. Your task is to find out whether the given tree is a mango tree or
 * not..  */
// n=5 means 5 rows and 5 columns
// t=11 means no. of trees are 11
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MangoTreeExecutor {
	
	static void isMangoTree(int n, int t){
		
		if(t%n==0 || t%n==1 || t<=n) {
			System.out.println("Is a Mango Tree");
		}
		else {
			System.out.println("Is not a Mango Tree");
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of n and t:");
		int n= s.nextInt();
		int t= s.nextInt();
		isMangoTree(n,t);

	}

}
