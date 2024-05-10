public class RearrangeArray {

    public static void rearrange(int[] arr, int k, int start, int end) {
        if (start >= end) return;
        
        if (arr[start] > k && arr[end] <= k) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        if (arr[start] <= k) rearrange(arr, k, start + 1, end);
        if (arr[end] > k) rearrange(arr, k, start, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 2, 8, 5, 7};
        int k = 5;

        rearrange(arr, k, 0, arr.length - 1);

        System.out.println("Rearranged Array with " + k + " as pivot:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
