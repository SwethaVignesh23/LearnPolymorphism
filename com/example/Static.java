package com.example;

public class Static {
	private void sample() {
		System.out.println("Employee Details:"+"\n==========");

	}
	private void sample(int id) {           // argument datatype 
		System.out.println("Employee Id:"+id);

	}
	private void sample(String name) {
		System.out.println("Employee name:"+name);

	}
	                     // argument count
	private void sample(String name, int value, String address) {
		System.out.println("Employee address:"+address);
		System.out.println("Employee value:"+value);

	}
	                    //argument order
	private void sample(char gender, long phn) {
		System.out.println("Employee gender:"+gender);

	}
	private void sample(long phn, char gender) {
		System.out.println("Employee phone numer:"+phn);

	}
	public static void main(String[] args) {
		Static  sd= new Static();
		sd.sample();
		sd.sample(25);
		sd.sample("SWETHA");
		sd.sample('F', 9789271423l);
		sd.sample(978927143l, 'F');
		sd.sample("swetha", 50, "ABC Nagar");
	}

}
