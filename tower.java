public class tower {
    public static void main(String[] args) {
        int a = 4;
        String source  = "A";
        String helper = "B";
        String  destination = "C";
        towerofhanoi(a,source,helper,destination);
    }

    public static void towerofhanoi(int a , String source , String helper , String destinayion){
        if (a==0) {
            return;
            
        }
        towerofhanoi(a-1, source, helper, destinayion);
        System.out.println(source + helper + destinayion);
        towerofhanoi(a-1,  helper, source,destinayion);
    }
}
