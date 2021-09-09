package classesandobjects;

public class Student {
	
	String name;
	private int rollno;
	double cgpa;
	public final static double CONVERSIONFACTOR = 0.95;
	private static int numStudents; //static keyword
	
	public int getRollno() {
		return this. rollno;
	}
	//Java provides default constructor NULL
	//Constructor
	
//	public Student(String n , int num) {
//		name=n;
//		rollno=num;
//	}
	
	//above function can be written using "this"
//	public Student(String name , int rollno) {
//		this.name=name;
//		this.rollno=rollno;
//		numStudents++;
//	}
	
	///STATIC
	public Student(String name) {
		this.name = name;
		numStudents++;
		this.rollno = numStudents; // for 1st-> Student roll no is 1 and so on 
	}
	
//	public Student (String n) {
//		name = n;
//		this.rollno = 10;
//	}
//	
	public Student() {
		name = "abc";
		numStudents++;
		this.rollno = numStudents;
	}
	
	public static int getNumStudents() {
		
		return numStudents;
	}
	
	public void print() {
		System.out.println(name + " "+ rollno);
	}
	
//	public void setRollno(int num) {
//		if(num<=0) {
//			return;
//		}
//		rollno=num;
//	}
	
	public void setRollno(int rollno) {
	if(rollno<=0) {
		return;
	}
	System.out.println("this address " + this);
	//this.rollno=rollno;
}
	
	
}
