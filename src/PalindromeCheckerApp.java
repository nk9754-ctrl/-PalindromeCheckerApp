import java.util.Scanner;
class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a string to check: ");
                String input = scanner.nextLine();

                char[] chars = input.toCharArray();
                int start = 0;
                int end = chars.length - 1;
                boolean isPalindrome = true;

                while (start < end) {
                    if (chars[start] != chars[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                if (isPalindrome) {
                    System.out.println("The string \"" + input + "\" is a palindrome.");
                } else {
                    System.out.println("The string \"" + input + "\" is NOT a palindrome.");
                }

                scanner.close();
            }
        }