public class number {
    public static void main(String[] args) {
        int a = 21412;
        printrev(a,a.length-1);
    }
    public static void printrev(int a , int idx){
        if (idx ==0) {
            System.out.println(a.int(idx));
            
        }
        System.out.println(a.int(idx));
        printrev(a, idx-1);

    }
}
