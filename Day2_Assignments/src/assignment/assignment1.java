package assignment;
import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("     Main Menu     ");
			System.out.println("1. Print Table of a Number");
			System.out.println("2. Calculate Factorial");
			System.out.println("3. check prime Number");
			System.out.println("4. Print fibonacii number");
			System.out.println("5. Exit");
			
			
			System.out.println("Enter the choice");
			
			choice = sc.nextInt();
			
			switch(choice) {
				
			case 1: // for table 
				System.out.println("Enter the number for Table");
				
				int n= sc.nextInt();
				
				for(int i=1;i<=10;i++) {
					System.out.println(n + " * "+ i+ " = "+ (n*i) );
				}
				break;
				
			case 2: 
				//for factorial
				System.out.println("Enter the number between (1-20) for Factorial  : ");
				
				int fact= sc.nextInt();
				
				if(fact>20) {
					System.out.println("Please Enter the number between (1-20)  ");
				}
				else {

					long ans=fact; 
					
					for(int i=(fact-1);i>0;i--) {
						ans*=i;
						
						
					}
					System.out.println("Answer of factorial of" + fact+ " = "+ ans );
				}
				
				
				break;
			case 3:
				//check prime
				System.out.println("Enter the number to check the Prime or not");
				int input= sc.nextInt();

				
				boolean isPrime = true;
				// since 0 and 1 are not prime so
				if(input==0 || input==1) {
					isPrime= false;
				}
				
				else {
					for(int i=2;i<input/2;i++) {
						if(input%i==0) {
							isPrime=false;
						}
						break;
				}
				}
				
				if(isPrime==true) {
					System.out.println(input +" is a prime number");
				}
				else {
					System.out.println(input+ " is not a Prime number");
				}
				break;
			
			case 4:
				//fibonacci
				  System.out.print("Enter  number of terms ");
				  
			      int number = sc.nextInt();
			      int a = 0, b = 1;
			      System.out.print("Fibonacci Series: ");
			      for (int i = 1; i <= number; i++) {
			          System.out.print(a + " ");
			          int nextNum = a + b;
			          a = b;
			          b = nextNum;
			      }
			      System.out.println();
			      
			      break;
			      
			case 5: 
				//exit
				System.out.println("Exit ");
				break;
				
			default:
				System.out.println("Please choose between 1 to 5");
			
			
			}
			 if (choice != 5) {
	                System.out.print("\nPress Enter  to get back  to  menu");
	                sc.nextLine(); 
	                sc.nextLine(); 
	                System.out.println(); 
	            }
			
			
			
			
		}
		
		while(choice!=5);
		sc.close();

	}

}
