package PracticeProblems;
public class Complex {
    double real, imaginary;
  
  
    public Complex(double real) {
        this.real = real;
        this.imaginary = 0.0;
    }
  
  
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
  

  

    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }
  

    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imaginary - c.imaginary);
    }

    public static void main(String[] args) {
        
        Complex n1 = new Complex(5,6);
        n1.subtract(n1);
    }
  

}