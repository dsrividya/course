public class Count {

    public static void count(int[] arr, int target, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 2, 4};
        int target = 3;
        int n = arr.length;
        Count.count(arr, target, n);
    }
}
