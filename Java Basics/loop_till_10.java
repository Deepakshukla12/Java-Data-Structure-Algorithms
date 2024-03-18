import java.util.*;

public class loop_till_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter the Number");
            int s = sc.nextInt();
            if (s % 10 == 0) {
                break;
            }
        }
        
        sc.close(); // Close the Scanner outside the loop
    }
}
