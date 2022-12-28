package main;

import java.sql.SQLOutput;

import static main.commonPreFix.longestCommonPrefix;
import static main.palindrome.isPalindrome;

public class main {
    public static void main(String[] args) {
        int x = 343;
        int y = 3434;
        int testNumber = 123321;

        System.out.println(isPalindrome(testNumber));;
    }

    static public boolean isPalindrome(int x) {
        String intStringified = String.valueOf(x);
        char[] charArray = new char[intStringified.length()];
        for (int i = 0; i<intStringified.length(); i++) {
            charArray[(intStringified.length()-1)-i] = intStringified.charAt(i);
        }
        String reverseString = new String(charArray);
        return reverseString.equals(intStringified);
    }
}