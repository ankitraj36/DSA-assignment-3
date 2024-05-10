
public class paindrome {
    public static void main(String[] args) {
        String s = "pots&pans";
        System.out.println(reverseString(s));
    }
    
    public static String reverseString(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }
    
}