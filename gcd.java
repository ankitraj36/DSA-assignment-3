public class gcd {
    public static void main(String[] args) {
        int m = 36;
        int n = 24;
        System.out.println(m  + "gcd" + n +  " =" + gcd(m,n));
    }
    public static int gcd(int m, int n){
        if (n==0) {
            return m;
            
        }else{
            return gcd(n, m%n);
        }

    }
}
//12
