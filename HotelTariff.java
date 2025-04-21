/*
Question 1:

Write a program to calculate the hotel tariff(budget). The room rent is 20% high during the peak season (April to June and Nov to Dec).
Hint: Switch case.
Input: No. of month=3, Rent= 1500, Days= 2 days.
Output: 3000 
*/
package org.tnsif.codingchallenge;
import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month: ");
		String month = sc.next();
		month.toLowerCase();
		int rent = 1500;
		System.out.println("Enter the Staying days: ");
		int days = sc.nextInt();
		float tarriff = 0;
		boolean isPeak =false;
		switch(month) {
		case("apr"):
		case("may"):
		case("jun"):
		case("nov"):
		case("dec"):{
		isPeak = true;
		break;
		}
		default:{
		isPeak = false;
		break;
		}
		}
		if(isPeak)
		{
		rent = ((25*rent)/100)+rent;
		tarriff = days * rent;
		}
		else
		tarriff = days * rent;

		System.out.println("Your bill is "+tarriff);
		
	}

}
