package com.assignmentFiles;

public class P1 {
	String productName;
	int productCount;
	public static void main(String[] args) throws EmptyCartException{
		P1 obj = new P1();
		obj.productCount = 0;
		obj.productName = "HeadSets";
		
		obj.cartStatus(obj.productCount);
		
		
	}
	public P1(String productName, int productCount) {
		super();
		this.productName = productName;
		this.productCount = productCount;
	}
	public P1() {
		super();
	}
	
	public String cartStatus(int count) throws EmptyCartException{
		if (count<=0) {
			throw new EmptyCartException();
		}
		else {
			return "You can proceed to checkout!!";
		}
	}
	
	
	
	
}
