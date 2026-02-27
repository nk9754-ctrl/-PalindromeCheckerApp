

import java.util.*;

public class PalindromeCheckerApp {


    public static boolean iterativeCheck(String input) {
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


    public static boolean recursiveCheck(String input, int start, int end) {
        if (start >= end) return true;
        if (input.charAt(start) != input.charAt(end)) return false;
        return recursiveCheck(input, start + 1, end - 1);
    }


    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (stack.pop() != c) {
                return false;
            }
        }
        return true;
    }


    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.add(c);
        }
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();


        long startTime = System.nanoTime();
        boolean iterativeResult = iterativeCheck(input);
        long endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;


        startTime = System.nanoTime();
        boolean recursiveResult = recursiveCheck(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        startTime = System.nanoTime();
        boolean stackResult = stackCheck(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;


        startTime = System.nanoTime();
        boolean dequeResult = dequeCheck(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;


        System.out.println("\nPerformance Comparison:");
        System.out.println("-------------------------------------------------");
        System.out.printf("Iterative: %-5s | Time: %d ns%n", iterativeResult, iterativeTime);
        System.out.printf("Recursive: %-5s | Time: %d ns%n", recursiveResult, recursiveTime);
        System.out.printf("Stack:     %-5s | Time: %d ns%n", stackResult, stackTime);
        System.out.printf("Deque:     %-5s | Time: %d ns%n", dequeResult, dequeTime);
        System.out.println("-------------------------------------------------");

        sc.close();
    }
}