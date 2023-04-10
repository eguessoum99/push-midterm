package string.problems;

import java.util.Scanner;
public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        // Implement here

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string as an input to check whether it is palindrome or not : ");
        String input= scanner.nextLine();
        //checking whether palindrome or not
        if(isPalindrome(input))
        {
            System.out.println(input+" is a palindrome string");
        }
        else
        {
            System.out.println(input+" is not a palindrome string");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}


