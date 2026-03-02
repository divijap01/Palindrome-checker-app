import java.util.Scanner;
import java.util.Stack;
import java.util.*;

// Class responsible only for palindrome logic (Single Responsibility Principle)
class PalindromeChecker {

    // Method to check palindrome using Stack (encapsulation)
    public boolean checkPalindrome(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
// Strategy Interface
        interface PalindromeStrategy {
            boolean isPalindrome(String input);
        }

// Stack
        class StackStrategy implements PalindromeStrategy {
            public boolean isPalindrome(String input) {
                Stack<Character> stack = new Stack<>();

                // Push characters to stack
                for (char c : cleaned.toCharArray()) {
                    for (char c : input.toCharArray()) {
                        stack.push(c);
                    }

                    // Compare with reversed order from stack
                    for (char c : cleaned.toCharArray()) {
                        for (char c : input.toCharArray()) {
                            if (c != stack.pop()) {
                                return false;
                            }
                            @@ -25,27 +23,74 @@ public boolean checkPalindrome(String input) {
                            }
                        }

// Main application class
                        public class UseCase11PalindromeCheckerApp {
                            // Deque आधारित रणनीति
                            class DequeStrategy implements PalindromeStrategy {
                                public boolean isPalindrome(String input) {
                                    Deque<Character> deque = new ArrayDeque<>();

                                    public static void main(String[] args) {
                                        for (char c : input.toCharArray()) {
                                            deque.add(c);
                                        }

                                        while (deque.size() > 1) {
                                            if (deque.removeFirst() != deque.removeLast()) {
                                                return false;
                                            }
                                        }
                                        return true;
                                    }
                                }

                                Scanner scanner = new Scanner(System.in);
                                // Context Class
                                class PalindromeChecker {
                                    private PalindromeStrategy strategy;

                                    public void setStrategy(PalindromeStrategy strategy) {
                                        this.strategy = strategy;
                                    }

                                    public boolean check(String input) {
                                        if (strategy == null) {
                                            throw new IllegalStateException("Strategy not set");
                                        }
                                        return strategy.isPalindrome(input);
                                    }
                                }

                                // Main Application
                                public class UseCase12PalindromeCheckerApp {
                                    public static void main(String[] args) {
                                        Scanner sc = new Scanner(System.in);
                                        PalindromeChecker checker = new PalindromeChecker();

                                        System.out.println("Palindrome Checker App");
                                        System.out.print("Enter a string: ");
                                        System.out.println("Enter a string:");
                                        String input = sc.nextLine();

                                        String input = scanner.nextLine();
                                        System.out.println("Choose Strategy:");
                                        System.out.println("1. Stack Strategy");
                                        System.out.println("2. Deque Strategy");

                                        boolean result = checker.checkPalindrome(input);
                                        int choice = sc.nextInt();

                                        if (result) {
                                            System.out.println("Result: The string IS a palindrome.");
                                        } else {
                                            System.out.println("Result: The string is NOT a palindrome.");
                                            switch (choice) {
                                                case 1:
                                                    checker.setStrategy(new StackStrategy());
                                                    break;
                                                case 2:
                                                    checker.setStrategy(new DequeStrategy());
                                                    break;
                                                default:
                                                    System.out.println("Invalid choice");
                                                    return;
                                            }

                                            scanner.close();
                                            boolean result = checker.check(input);

                                            if (result)
                                                System.out.println("Palindrome");
                                            else
                                                System.out.println("Not a Palindrome");

                                            sc.close();
                                        }
                                    }