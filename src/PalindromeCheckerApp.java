import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                System.out.print("Enter a string to check: ");
                String input = scanner.nextLine();

                Deque<Character> deque = new ArrayDeque<>();
                for (char c : input.toCharArray()) {
                    deque.add(c);
                }

                boolean isPalindrome = true;
                while (deque.size() > 1) {
                    char front = deque.removeFirst();
                    char rear = deque.removeLast();
                    if (front != rear) {
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