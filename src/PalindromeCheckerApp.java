

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();


        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome (ignoring case and spaces).");
        }

        sc.close();
    }
}