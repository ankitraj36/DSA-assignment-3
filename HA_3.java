public class HA_3 {
    public static void main(String[] args) {
        int num = 13; // Example decimal number
        System.out.println("Binary equivalent of " + num + " is: " + Binaryeq(num));
    }

    public static String Binaryeq(int num) {
        if (num == 0) {
            return "0"; // Base case: if decimal is 0, return "0"
        } else if (num == 1) {
            return "1"; // Base case: if decimal is 1, return "1"
        } else {
            int remainder = num % 2;
            int quotient = num / 2;
            return Binaryeq(quotient) + remainder; // Recursive call with quotient
        }
    }
}
