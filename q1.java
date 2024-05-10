
import java.util.*;
public class q1 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     try{
        int num = sc.nextInt();
        if (num<0) {
           System.out.println("Negative number is not MY lUCK NUMBER");            
        }else{
            System.out.println("My Lucky Number is" + num);
        }
     }catch(NumberFormatException e){
        System.out.println(e.getMessage());
     }
    }
}