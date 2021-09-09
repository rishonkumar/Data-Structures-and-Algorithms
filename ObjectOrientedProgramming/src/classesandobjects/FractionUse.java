package classesandobjects;

public class FractionUse {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(4,6);
		f1.print();
//		f1.setNumerator(12);
//		f1.getNumerator();
//		f1.increment(); //adding one to a fraction eg (2/3)+1 = 5/3
//		f1.print();
		
		Fraction f2 = new Fraction(4,8);
		//varation 1 of adding 2 fraction
//		f1.add(f2); //adding two fraction
//		f1.print();
		//Method 2
		Fraction f3 = Fraction.add(f1, f2);
		f3.print();
	}

}
