package Methods;
import java.util.*;
public class factorial {
    
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int num=sc.nextInt();
    System.out.println(fact(num));
    sc.close();
}

public static int fact(int a){
    int mul=1;
    if(a>0){

        for(int i=1;i<=a;i++){
            mul*=i;
        }
    }
    return mul;
}

}
