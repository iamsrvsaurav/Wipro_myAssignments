package assignment;
import java.util.Scanner;

public class assignment2 {

	 public static void countVowelsAndConsonants(String input) {
	        input = input.toLowerCase();  
	        int vowels = 0, consonants = 0;

	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                if ("aeiou".indexOf(ch) != -1) {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }

	        System.out.println("vowels: " + vowels);
	        System.out.println("consonants: " + consonants);
	    }
    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public static String replaceWord(String str, String oldWord, String newWord) {
        return str.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            
            System.out.println("Main Menu");
            System.out.println("1.Count vowels and consonent");
            System.out.println("2.Check palindrome");
            System.out.println("3.reverse string");
            System.out.println("4.Convert to uppercase");
            System.out.println("5.Convert to lowercase");
            System.out.println("6.Replace word");
            System.out.println("7.Exit");
        
            System.out.print("Enter the choice between (1-7): ");
            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter the string: ");
                String input = sc.nextLine();

                switch (choice) {
                    case 1:
                        countVowelsAndConsonants(input);
                        break;
                    
                    case 2:
                        if (isPalindrome(input))
                            System.out.println("this is a palindrome.");
                        else
                            System.out.println("this is not a palindrome.");
                        break;
                    case 3:
                        System.out.println("reversed string: " + reverseString(input));
                        break;
                    case 4:
                        System.out.println("uppercase: " + toUpperCase(input));
                        break;
                    case 5:
                        System.out.println("lowercase: " + toLowerCase(input));
                        break;
                }

            } else if (choice == 6) {
                System.out.print("Enter a string: ");
                String input = sc.nextLine();
                System.out.print("Enter word to replace: ");
                String oldWord = sc.nextLine();
                System.out.print("Enter new word: ");
                String newWord = sc.nextLine();
                System.out.println("new updated string: " + replaceWord(input, oldWord, newWord));
            } else if (choice == 7) {
                System.out.println("Exit");
            } else {
                System.out.println("Invalid value, please enter the value between (1-7)");
            }

            if (choice != 7) {
                System.out.print("\nPress Enter to return to the menu");
                sc.nextLine();
            }

        } while (choice != 7);

        sc.close();
    }
}
