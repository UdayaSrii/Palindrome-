import java.util.Scanner;
public class PalindromeChecker {
    // Create a method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the comparison case-insensitive
        int left = 0;
        int right = str.length() - 1;
        // The loop will continue until the left pointer is less than the right pointer
        while (left < right) {
            // Create a variable to store the left character
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;  // Return true if the string is a palindrome
    }
    // The main method to test the isPalindrome method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Give the user a prompt to enter a string
        System.out.print("Enter a string to check if it's a palindrome: ");
        String inputString = sc.nextLine();
        // The isPalindrome method will return true if the string is a palindrome, otherwise it will return false
        inputString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Find out if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }
}

