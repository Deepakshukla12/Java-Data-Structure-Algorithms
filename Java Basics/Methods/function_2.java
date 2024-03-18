package Methods;
import java.util.*;
public class function_2 {
    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println("Sum is: "+print_sum(num1, num2)); // here num1 and num2 are arguments/ actual parameters
    sc.close();
}

public static int print_sum(int a, int b){ //here a and b are parameters/formal paramyers
    return (a+b);
}

}
