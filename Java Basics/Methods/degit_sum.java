package Methods;

import java.util.Scanner;

public class degit_sum {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        System.out.println("Sum of given digits is: "+ sum(num));
        sc.close();
    }

    private static  int sum(int n){
        int sum=0;
        while(n>0){
            int lastDigit=n%10;
            sum+=lastDigit;
            n/=10;
        }
        return sum;
    }
}
