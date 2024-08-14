package com.revature.collections;
import java.util.*;


public class MyHashMap {
	public static void main(String[] args) {
	//	HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();
		
		myMap.put(1, "Faizan");
		myMap.put(2, "Ankit");
		myMap.put(3, "Anni");
		myMap.put(4, "Manan");
		myMap.put(5, "Obj");
		
		
		for (int key : myMap.keySet()) {
			System.out.println(key + " : " + myMap.get(key));
		}
		
		System.out.println(myMap.get(1));
		System.out.println(myMap);
	}
}
