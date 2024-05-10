import java.util.*;
public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(product(a,b));

    }
    public static int product(int a , int b){
        if (b ==0) {
            return 0;
            
        }else{
            return a*b;
        }
    }
    
}
