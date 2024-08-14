package com.revature.collections;
import java.util.*;

public class TeamList {
	public static void main(String[] args) {
		List<String> teamD = new ArrayList();
		
		teamD.add("Manjeet");
		teamD.add("Ankit");
		teamD.add("Faizan");
		teamD.add("Chayan");
		teamD.add("Pratik");
		teamD.add("Abhijeet");
		
		
		/*Printing using the iterator 
		 * 
		for (Iterator myTeam = teamD.iterator(); myTeam.hasNext();) {
			String string = (String) myTeam.next();
			System.out.println(string);
		}*/
		
		
		//Printing using for loop
		
//		for (String string : teamD) {
//			System.out.println(string);
//		}
		
		//Clear method
		//teamD.clear();
		
		
		//get() method
		System.out.println(teamD.get(2));
		
		
//		remove method
		//teamD.remove(teamD.size()-1);
		//teamD.remove("Manjeet");
		
		System.out.println(teamD.get(0));
		
		
		
	}
}
