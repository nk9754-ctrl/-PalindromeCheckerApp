import java.util.Scanner;
import java.util.Stack;
class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a string to check: ");
                String input = scanner.nextLine();

                Stack<Character> stack = new Stack<>();
                for (char c : input.toCharArray()) {
                    stack.push(c);
                }

                boolean isPalindrome = true;
                for (char c : input.toCharArray()) {
                    if (c != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println("The string \"" + input + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + input + "\" is NOT a palindrome.");
                }

                scanner.close();
            }
        }