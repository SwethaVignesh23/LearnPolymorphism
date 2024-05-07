package com.example;

//child cass

public class ExecuteClass extends SampleOveride {
	
	@Override
	public void savings() {
		System.out.println("savnigs changes to----->8%");
	}
	
	public static void main(String[] args) {
	
		ExecuteClass ec =new ExecuteClass();
		
		ec.savings();
		ec.deposite();
	
	}

}
