import java.util.*;

public class Complex{
	double real;
	double imag;

	public Complex(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	public static Complex sum(Complex n1, Complex n2){
		Complex temp = new Complex(0.0, 0.0);
		temp.real = n1.real + n2.real;
		temp.imag = n2.imag + n2.imag;
		return (temp);
	}

	public static Complex difference(Complex n1, Complex n2){
		Complex temp = new Complex(0.0, 0.0);
		temp.real = n1.real - n2.real;
		temp.imag = n1.imag - n2.imag;
		return (temp);
	}
	public static Complex product(Complex n1, Complex n2){
		Complex temp = new Complex(0.0, 0.0);
		temp.real = n1.real * n2.real;
		temp.imag = n1.imag * n2.imag;
		return (temp);
	}

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the real number 1: ");
		float real = sc.nextFloat();
		System.out.print("Enter the imag number 1: ");
		float imag = sc.nextFloat();
		Complex c1 = new Complex(real, imag);

		System.out.print("Enter the real number 2: ");
                real = sc.nextFloat();
                System.out.print("Enter the imag number 2: ");
                imag = sc.nextFloat();
                Complex c2 = new Complex(real, imag);

		Complex temp = sum(c1, c2);
		System.out.println("Sum of real number :" +temp.real+"Imag: " +temp.imag);
		temp = difference(c1, c2);
		System.out.println("Difference of two complex number real : "+temp.real+" imag: "+temp.imag);
		temp = product(c1, c2);
		System.out.println("Product of two complex number real: "+temp.real+" imag: "+temp.imag);
	}
}
