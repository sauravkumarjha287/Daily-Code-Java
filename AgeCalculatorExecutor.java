/* Ask a user for their birth year encode it as two digit(like "2003"= 03) and for the current year also encode it as two digit (like "2023"=23). Write
 * a program to find user's current age in years.
 * */
package org.tnsif.codingchallenge;
import java.util.*;

public class AgeCalculatorExecutor {
	static void agecalc(int cy, int by){
		if(cy>by) {
			int age= cy-by;
			System.out.println("Your age is:"+age);   // cy=23, by=03
		} 
		else {
			int age= (100-by)+cy;  // cy=23, by=96
			System.out.println("Your age is:"+age);
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the birth and current year:");
		int by= s.nextInt();
		int cy= s.nextInt();
		agecalc(cy,by);

	}

}
