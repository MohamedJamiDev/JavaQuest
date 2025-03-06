package leetCodeProblems;

//A polindrome number is a number that is the same when reversed, for example: 121---> 121

/*	•	We start with a number.
	•	We use math to flip the number backward.
	•	% 10 gets the last digit.
	•	* 10 + digit adds it to our reversed number.
	•	/ 10 removes the last digit so we can keep going.
	•	After we finish, we check:
	•	If the original number is the same as the reversed one.
	•	If yes, it’s a palindrome!
	•	If no, it’s not a palindrome.
* */

public class PalindromeNumber {

    public static void main(String[] args) {

        // Step 1: Pick any number you want to check
        int number = 121;

        // Step 2: Save the original number so we can compare later
        int originalNumber = number;

        // Step 3: Create a place to store the reversed number
        int reversedNumber = 0;

        // Step 4: Flip the number backwards
        while (number != 0) {
            int digit = number % 10; // Take the last digit of the number
            reversedNumber = reversedNumber * 10 + digit; // Add that digit to the reversed number
            number = number / 10; // Remove the last digit from the number
        }

        // Step 5: Check if the original number and reversed number are the same
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome!");
        } else {
            System.out.println(originalNumber + " is NOT a palindrome");
        }
    }
}