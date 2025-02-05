public class MaximumConsecutive {
    public static int consecutive(int[] arr) {
        int count = 0; // This will track the current length of consecutive ones.
        int maxCount = 0; // This will track the longest sequence of consecutive ones.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++; // Increment count if the element is 1.
                maxCount = Math.max(maxCount, count); // Update maxCount if current count is greater.
            } else {
                count = 0; // Reset count if the element is not 1.
            }
        }
        return maxCount; // Return the longest sequence of consecutive ones.
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1};
        int ind = MaximumConsecutive.consecutive(arr);
        System.out.println(ind); // Output: 3 (longest consecutive ones)
    }
}


