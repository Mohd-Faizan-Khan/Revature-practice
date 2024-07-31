package com.assignment;
import java.util.*;

public class P3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of classes held: ");
		int totalClass = scanner.nextInt();
		
		System.out.print("Enter the number of classes you attended: ");
		int classAttended = scanner.nextInt();
		
		double attendancePercentage= classAttended*100/totalClass;
		
		System.out.println("Your attendance is: " + attendancePercentage + "%");
		
		if (attendancePercentage<75) {
			System.out.println("Your attendance is low :(\nDo you have medical cause? (Y or N)");
			char medCard = scanner.next().charAt(0);
			if (medCard == 'y' || medCard == 'Y') {
				System.out.println("Submit the medical reports to your respective faculty");
			}
			else
				System.out.println("You are not allowed to attend, talk to your respective faculty!");
		}
		
		else
			System.out.println("You have great attendance :) \nKeep going");
	}
}
