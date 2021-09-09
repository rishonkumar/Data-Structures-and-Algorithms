package classesandobjects;

public class StudentUse {

	public static void main(String[] args) {

//		Student s1 = new Student();
//		
//		System.out.println(s1); // s1->reference to the object
//		//System.out.println(s1.name + " " + s1.rollno); //default value is null and 0
//		s1.name="Rishon kumar";
//		//s1.rollno=31;
//		s1.setRollno(31);
		
//		Student s2 = new Student();
//		s2.name="Sakthia";
//		s2.rollno=51;
//		s2.setRollno(51);
//		System.out.println(s1.name + " " + s1.getRollno()); //s1.rollno);
//		System.out.println(s2.name + " " + s2.getRollno());
		
		
//		//THIS KEYWORD
//		Student s1;
//		s1 = new Student("");
//		s1.name="Rishon";
//		System.out.println("s1 address " + s1);//address of s1
//		s1.setRollno(31);
//		System.out.println(s1.name+" "+s1.getRollno());
//		
//		Student s2 = new Student();
//		System.out.println("s2" + s2);
//		s2.setRollno(100);
		
		//CONSTRUCTOR 
		
		Student s1;
		s1 = new Student("Rishon"); // We have to mention name and roll no coz 
		//in constructor they are called
		//s1.print();
		Student s2 = new Student("Sakthia");
		//s2.print();
		Student s3 = new Student("Rizon");
		//Static
//		System.out.println(s1.numStudents);//wrong way of accessing static 
//		System.out.println(s2.numStudents);
//		System.out.println(Student.numStudents);//correct way of accessing static 
		System.out.println(Student.getNumStudents());
	}
	
	

}
