package com.revature.collections;
import java.util.*;

public class Employee implements Comparable{
	private String eName;
	private int eId;
	private double eSal;
	
	
	
	public Employee(String eName, int eId, double eSal) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eSal = eSal;
	}

	public String geteName() {
		return eName;
	}

	public int geteId() {
		return eId;
	}

	public double geteSal() {
		return eSal;
	}

	@Override
	public int compareTo(Object o) {
		if (this.eSal > ((Employee) o).geteSal()) {
			return 1;
		}
		if (this.eSal < ((Employee) o).geteSal()) {
			return -1;
		}
		return 0;
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		
//		return 0;
//	}
	
	
}
