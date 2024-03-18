import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {

        // values from 1 to 10
        int j = 1;
        while (j<=10) {
            System.out.println(j);
            j++;
        }

        // values from 1 to n
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        while (count<=n) {
            System.out.println(count);
            count++;
        }

        // sum of first n natural numbers
        int range=sc.nextInt();
        int i=1;
        int sum=0;
        while (i<=range) {
            sum+=i;
            i++;
        }
        System.err.println(sum);

        sc.close();
    }
}
