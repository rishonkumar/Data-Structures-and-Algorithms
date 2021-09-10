package classesandobjects;

public class ComplexNumber {

	int real;
	int imaginary;
	
	//Creating Constrcutor
	ComplexNumber(int real, int imaginary){
		this.real = real;
		this.imaginary = imaginary;
		
	}
	 void plus(ComplexNumber c) {
		 this.real+=c.real;
	     this.imaginary+=c.imaginary;
	}
	
	 void multiply(ComplexNumber c) {
		 int newReal=((this.real)*(c.real))-(this.imaginary*c.imaginary);
	     int newImag=(this.real*c.imaginary)+(this.imaginary*c.real);
		 this.real = newReal;
		 this.imaginary = newImag;
	}
	
	 void print() {
		System.out.print(this.real+" + i" + this.imaginary);
	}
	

}
