import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        boolean isPalindrome = isPalindrome(x);
        if (isPalindrome) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int rem;
        int original = x;
        
        while (x != 0) {
            rem = x % 10;
            rev = (rev * 10) + rem;
            x /= 10;
        }
        return original == rev;
    }
}
