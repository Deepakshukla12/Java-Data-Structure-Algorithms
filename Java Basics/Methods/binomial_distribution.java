// function/ code to find binomial function of any distribution.


package Methods;
import java.util.*;
public class binomial_distribution{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the values of n and r");
    int n=sc.nextInt();
    int r=sc.nextInt();
    int other=n-r;

   int n_fact=binomail_coff(n);
   int r_fact=binomail_coff(r);
   int other_fact=binomail_coff(other);

   int output=(n_fact)/(r_fact * other_fact);

   System.out.println("Binomial Distribution = "+ output);

    sc.close();
}

public static int binomail_coff(int a){

        int f=1;
        for(int i=1;i<=a;i++){
        f*=i;
    }

return f;

}

}