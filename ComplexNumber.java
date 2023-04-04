public class ComplexNumber {
private double real;
private double imaginary;

public ComplexNumber(double real, double imaginary) {
this.real = real;
this.imaginary = imaginary;
}

public ComplexNumber add(ComplexNumber other) {
double newReal = this.real + other.real;
double newImaginary = this.imaginary + other.imaginary;
return new ComplexNumber(newReal, newImaginary);
}

public String toString() {
if (imaginary >= 0) {
return real + " + " + imaginary + "i";
} else {
return real + " - " + (-imaginary) + "i";
}
}

public static void main(String[] args) {
ComplexNumber num1 = new ComplexNumber(2, 3);
ComplexNumber num2 = new ComplexNumber(4, -1);
ComplexNumber sum = num1.add(num2);
System.out.println(num1 + " + " + num2 + " = " + sum);
}
}
