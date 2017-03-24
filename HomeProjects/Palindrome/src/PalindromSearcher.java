
import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, I am the mighty palindrome searcher, please enter a sentence.");
        String answer = scanner.nextLine();
        ArrayList<String> storedPalindromes = findPalindromes(answer);
        for (String s : storedPalindromes) {
            System.out.print("," + s + ",");
        }


    }

    public static ArrayList<String> findPalindromes(String answer) {
        // "dog goat dad duck doodle never" < ---- input
        // "og go", " dad ", "d d", "dood", "eve" < ---- output
        ArrayList<String> palindroms = new ArrayList<>();
        for (int c = 0; c < answer.length(); c++) {
            for (int p = 3; p < answer.length(); p++) {
                if (c + p < answer.length()) {
                    String pal = answer.substring(c, c + p);
                    if (isPalindrome(pal)) {
                        palindroms.add(pal);
                    }
                }

            }
        }
        return palindroms;
    }

    public static boolean isPalindrome(String input) {
        // kajak
        if (input.length() <= 2) {
            return false;
        }
        String firstHalf = input.substring(0, input.length() / 2);
        String secondHalf = input.substring(input.length() - input.length() / 2, input.length());
        String reversedSecondHalf = reverseString(secondHalf);
        if (firstHalf.equals(reversedSecondHalf)) {
            return true;
        }
        return false;
    }

    public static String reverseString(String input) {
        int length = input.length();
        String retchar = "";
        for (int i = (length - 1); i >= 0; i--) {
            retchar = retchar + input.charAt(i);
        }
        return retchar;
    }
}


