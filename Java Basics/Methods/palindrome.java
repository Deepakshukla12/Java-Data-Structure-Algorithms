package Methods;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (isPalindrome(a)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not Palindrome number");
        }
        sc.close();
    }

    public static boolean isPalindrome(int num) {
        int rev = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }

        return temp == rev;
    }
}
