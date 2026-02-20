import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a string to check: ");
                String input = scanner.nextLine();

                Queue<Character> queue = new LinkedList<>();
                Stack<Character> stack = new Stack<>();

                for (char c : input.toCharArray()) {
                    queue.add(c);   // enqueue
                    stack.push(c);  // push
                }

                boolean isPalindrome = true;
                while (!queue.isEmpty()) {
                    char fromQueue = queue.remove(); // dequeue
                    char fromStack = stack.pop();    // pop
                    if (fromQueue != fromStack) {
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