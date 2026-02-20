public class PalindromeCheckerApp {





    public static void main(String[] args) {


        System.out.println("   Welcome to PalindromeChecker App");
        System.out.println("   Version: 1.0");



        System.out.println("Application initialized successfully.");
        System.out.println("Ready to validate palindromes...");
    }
}


    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("   Welcome to PalindromeChecker App");
        System.out.println("   Version: 3.0");
        System.out.println("=======================================");


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();


        String reversed = new StringBuilder(input).reverse().toString();


        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }


        scanner.close();
    }
