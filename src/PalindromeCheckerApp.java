// File: UseCase11PalindromeCheckerApp.java

import java.util.Scanner;

// Encapsulated PalindromeChecker class
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // mismatch found
            }
            start++;
            end--;
        }
        return true; // all matched
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Call the encapsulated method
        boolean result = checker.checkPalindrome(input);

        // Output result
        if (result) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}