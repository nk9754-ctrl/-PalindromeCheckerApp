// File: UseCase9PalindromeCheckerApp.java

import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base condition: if start >= end, it's a palindrome
        if (start >= end) {
            return true;
        }
        // If mismatch found, not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call: move inward
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call recursive palindrome checker
        boolean result = isPalindrome(input, 0, input.length() - 1);

        // Output result
        if (result) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}