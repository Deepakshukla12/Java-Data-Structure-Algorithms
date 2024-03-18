package Methods;

import java.util.Scanner;

public class binary_decimal {
    public static void main(String[] args) {
        	
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(dec(num));

        sc.close();
    }

    public static int dec(int a){
	    int pow=0;
	    int val=0;
	   while(a>0){
	       int rem=a%10;
	       val=val+ (rem*(int)(Math.pow(2,pow)));
	       a=a/10;
	       pow++;
	   }
	   return val;
	    
	}
}
