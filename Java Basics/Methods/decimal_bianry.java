package Methods;

// code to convert decimal number to binary number

import java.util.*;

public class decimal_bianry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        System.out.println(convert(n));
        sc.close();
    }

public static int convert(int a){
    int pow=0;
    int bin=0;

    while(a>0){
        int rem=a%2;
        bin=(int) (bin+(rem*Math.pow(10,pow)));
        pow++;
        a/=2;
    }
    return bin;
}

}
