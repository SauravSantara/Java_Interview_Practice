package Core;
public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        // removed all non-alphanumeric characters and convert the rest to lower case for making comparison case-insenitive
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "A man, a plan, a canal: Panama";
        String str3 = "hello";
        String str4 = null;

        System.out.println("\"" + str1 + "\" is a palindrome: " + isPalindrome(str1));
        System.out.println("\"" + str2 + "\" is a palindrome: " + isPalindrome(str2));
        System.out.println("\"" + str3 + "\" is a palindrome: " + isPalindrome(str3));
        System.out.println("null is a palindrome: " + isPalindrome(str4));
    }
}
