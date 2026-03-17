/*

 * ============================================================
 * MAIN CLASS – UseCase1PalindromeApp
 * ============================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0


public class UseCase1PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments

    public static void main(String[] args) { ... }
}

 */

class PalindromeChecker {
    private char[] stack;
    private int top;

    // Constructor
    public PalindromeChecker(int size) {
        stack = new char[size];
        top = -1;
    }

    // Push operation (Stack)
    private void push(char ch) {
        stack[++top] = ch;
    }

    // Pop operation (Stack)
    private char pop() {
        return stack[top--];
    }

    // Public method to check palindrome
    public boolean checkPalindrome(String str) {
        int n = str.length();

        // Reset stack
        top = -1;

        // Push all characters into stack
        for (int i = 0; i < n; i++) {
            push(str.charAt(i));
        }

        // Compare with reversed (using stack pop)
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";

        PalindromeChecker checker = new PalindromeChecker(input.length());

        boolean result = checker.checkPalindrome(input);

        // Required Output Format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}
