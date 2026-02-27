

import java.util.Scanner;


class PalindromeChecker {

   
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

     
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }
        return true; 
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        
        boolean result = checker.checkPalindrome(input);

      
        if (result) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}
