package bai11;

import java.util.Scanner;

public class ComplexNB {
    private double a;
    private double b;

    public ComplexNB() {
    }

    public ComplexNB(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void Enter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real number");
        a= scanner.nextDouble();
        System.out.println("Enter imaginary number");
        b= scanner.nextDouble();
    }
    public void displayComplex(){
        if(b>0){
            System.out.println( a+ " + "+b+"*i");
        } else {
            System.out.println(a+ " - " + Math.abs(b) + "*i");
        }
    }
    public ComplexNB plusComplex(){
        ComplexNB complexNB2= new ComplexNB(); // tạo 1 đối tượng số phức mớ
        double real = a + complexNB2.a; // công thức tính a+a
        double imaginary = b+ complexNB2.b;
        return new ComplexNB( real , imaginary );
    }
    public ComplexNB multiplication( ){
        ComplexNB complexNB2= new ComplexNB();
        double real = a* complexNB2.a - b * complexNB2.b;// cong thuc : (a+bi)(c+di)=(ac-bd)+(ad+bc)i;
        double imaginary = (a * complexNB2.a + b * complexNB2.b);
        return new ComplexNB(real,imaginary);

    }
}
