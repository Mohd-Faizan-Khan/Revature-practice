package com.revature.collections;
import java.util.*;

public class MySet {
	public static void main(String[] args) {
		//Set<String> mySet1 = new HashSet<>();
	Set<String> mySet1 = new TreeSet<>();
	//	Set<String> mySet1 = new LinkedHashSet<>();
		
		
		mySet1.add("CSE");
		mySet1.add("IT");
		mySet1.add("ECE");
		mySet1.add("IT");
		mySet1.add("EEE");
		
		for (Iterator iterator = mySet1.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
