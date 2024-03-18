import java.util.*;
public class ternary_1 {
    public static void main(String[] args) {
        int x=12;
        String b=(x%2==0)?"Even number":"Odd number";
        System.out.println(b);     


        // one more example of student pass or fail


        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String update=(marks>=33)?"PASS":"FAIL";
        System.out.println(update);
        sc.close();
    }
}
