package bai11;

import java.util.Scanner;

public class MainComplexNb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ComplexNB complexNB = new ComplexNB();
        ComplexNB complexNB2= new ComplexNB();
        int choice;
//        System.out.println("Enter first complex: ");
//        complexNB.Enter();
//        System.out.println("Enter second complex: ");
//        complexNB2.Enter();
//
//        System.out.println(" first complex : ");
//        complexNB.displayComplex();
//        System.out.println(" second complex : ");
//        complexNB2.displayComplex();
        do {
            System.out.println("--------menu--------");
            System.out.println(" Enter 1. enter complex ");
            System.out.println(" Enter 2. display complex");
            System.out.println("0. Exit");
            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter complex 1:");
                    complexNB.Enter();
                    System.out.println("Enter complex 2:");
                    complexNB2.Enter();
                    do {
                        System.out.println("Enter 1. Adding complex number ");
                        System.out.println("Enter 2. Multiplication Complex number");
                        System.out.println("Enter 3. display complex");
                        System.out.println("0. Exit");
                        choice = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice){
                            case 1: complexNB.plusComplex();
                            break;
                            case 2: complexNB.multiplication();
                            break;
                            case 3:
                                System.out.println(" Complex 1: ");
                                complexNB.displayComplex();
                                System.out.println(" Complex 2: ");
                                complexNB2.displayComplex();
                        }
                    }while (choice != 0);
                    break;
                case 2:
                    System.out.println("Complex 1 : ");
                    complexNB.displayComplex();
                    System.out.println("Complex 2 : ");
                    complexNB2.displayComplex();
                    break;

            }
        } while (choice !=0);
    }
}
