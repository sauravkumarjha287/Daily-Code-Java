/* Ask the customer's age and for the time on a 24- hour clock
(where noon is 12.00 and 4:30PM is 16.30).The show timings are
 10.15, 13.30, 18.00 and 22.00. The normal adult ticket price is $8.00,
 however, the adult matinee price is $5.00. Adults are those over 13
 years. The normal children's ticket price is $4.00, however, the
 children's matinee price is $2.00. Write a program that determines the
 price of a movie ticket.
 
 Sample input:                            Sample output:
 16											$8.00
 10.15
 * 
 */
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MovieTicket {
	
	static void ticket(int age, float st) {
		// adult
		if(age>13) 
		{
			if(st>=13.30 && st<=17.59) {
				System.out.println("$5.00");
			}
			else
			{
				System.out.println("$8.00");
			}
		}
		// children
		else
		{
			if(st>=13.30 && st<=17.59) {
				System.out.println("$2.00");
			}
			else
			{
				System.out.println("$4.00");
			}
		}
		
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int age= s.nextInt();
		float st= s.nextFloat();
		ticket(age,st);
		
	}
}		
		
		
		
		
		
		
		
		
		
		
