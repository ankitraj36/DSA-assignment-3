public class rea {
    public static void main(String[] args) {
        int[] arr = {7, 13, 11, 14, 2};

        int[] rearrangedArray = rearrange(arr, 11);
        for (int i = 0; i < rearrangedArray.length; i++) {
            System.out.print(rearrangedArray[i] + " ");
        }
    }

    public static int[] rearrange(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int count = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                arr[k] = nums[i];
                k++;
            }
            if (nums[i] == pivot) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[k] = pivot;
            k++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                arr[k] = nums[i];
                k++;
            }
        }
        return arr;
    }
}

