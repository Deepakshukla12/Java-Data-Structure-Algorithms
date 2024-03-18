import java.util.Scanner;

public class if_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reverse=0;
        while(num!=0){
            int rem=num%10;
            reverse= reverse*10+rem;
            num/=10;
        }
        System.out.println("Reverse ="+reverse);
        sc.close();
    }
}
