import java.util.*;
public class pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the times to be printed:  ");
        int n = sc.nextInt();
        // int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
                // sum+=j;                       // To count the sum of each row
            }
            System.out.println();
            // System.out.println(sum);         // To print the sum of each row
        }
        sc.close();
    }
}
