public class reversetring {
    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "gohangasalamiimalasagnahog";
        
        System.out.println(s1 + " is a palindrome: " + Palindrome(s1));
        System.out.println(s2 + " is a palindrome: " + Palindrome(s2));
    }
    
    public static boolean Palindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
 
    }else if (s.charAt(0) == s.charAt(s.length() -1)) {
        return Palindrome(s.substring(1, s.length()-1));
    }
    return false;
}
}
