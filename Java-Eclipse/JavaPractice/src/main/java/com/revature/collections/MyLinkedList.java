package com.revature.collections;
import java.util.*;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("Faizan");
		myList.add("Ankit");
//		myList.addFirst("Anni");
//		myList.addLast("Obj");
		
		for (Iterator iterator = myList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
