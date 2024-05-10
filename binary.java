public class binary {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7};
        int target = 1;
        int s =0;
        int e = arr.length-1;
        System.out.println(binary(arr, target ,s, e ));
    }
    public static int binary(int arr[], int target, int s, int e){
        if (s>e) {
            return -1;
            
        }

        int m = s + (e-s)/2;

        if (arr[m]== target) {
            return m;
            
        }

        if (target<arr[m]) {
            return binary(arr, target, s, e-1);

            
        }else{
            return binary(arr, target, s+1, e);
        }
    }
    
}
