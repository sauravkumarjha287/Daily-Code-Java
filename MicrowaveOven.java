/* 
Question 2:

A microwave oven manufacturer recommends that when heating two items add 50% to the heating time, and when heating three items double the heating time. Heating more than 3 items at once is not recommended. Write a program to find out the recommended heating time.
Input: Item=2, Heating time= 5.0
Output: 7.5
*/
 
package org.tnsif.codingchallenge;
import java.util.Scanner;

public class MicrowaveOven {
	static float calcRecommendedTime(int items, float heatTime)
	{
	float recommTime =0;
	if(items ==1)
	{
	return heatTime;
	}
	if(items ==2)
	{
	recommTime= ((heatTime)/2) + heatTime;
	}
	else if(items == 3)
	recommTime = 2 * heatTime;
	else
	{
	System.out.println("Heating More than 3 items is not recommended...!!!");
	}
	return recommTime;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		float heatTime = 5;
		System.out.println("Recommeded time for heating is"+calcRecommendedTime(items, heatTime)+" mins.");
	}

}
