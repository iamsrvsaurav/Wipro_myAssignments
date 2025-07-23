package assignment;

import java.util.Scanner;

class MathOperations {

    public void printTable(int n) {
        System.out.println("Table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public long Factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean checkPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public void Fibonacci(int t) {
        int a = 0, b = 1;
        System.out.println("fibonacci series up to " + t + " terms:");
        for (int i = 1; i <= t; i++) {
            System.out.print(a + " ");
            int n = a + b;
            a = b;
            b = n;
        }
        System.out.println();
    }
}


public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperations math = new MathOperations();

        int choice;
        do {
            System.out.println("\n Main Menu");
            System.out.println("1.Print multiplication table");
            System.out.println("2.Calculate factorial");
            System.out.println("3.Check prime number");
            System.out.println("4.Print fibonacci series");
            System.out.println("5.Exit");
            System.out.print("Enter the choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number for table printing : ");
                    int numTable = sc.nextInt();
                    math.printTable(numTable);
                    break;

                case 2:
                    System.out.print("Enter the number for factorial: ");
                    int numFact = sc.nextInt();
                    System.out.println("Factorial of " + numFact + " is " + math.Factorial(numFact));
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int numPrime = sc.nextInt();
                    if (math.checkPrime(numPrime))
                        System.out.println(numPrime + " is a Prime number.");
                    else
                        System.out.println(numPrime + " is NOT a Prime number.");
                    break;

                case 4:
                    System.out.print("Enter number of terms: ");
                    int terms = sc.nextInt();
                    math.Fibonacci(terms);
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice,please choose between (1-5)");
            }

        } while (choice != 5);

        sc.close();
    }
}
