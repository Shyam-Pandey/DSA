public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int size = nums.length;
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < size; i++) {
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i + 1);
        }
        return xor1 ^ xor2;
    }

    public static void main(String args[]) {
        int nums[] = { 4, 1, 2, 3 };
        int arr = missingNumber(nums);
        System.out.println(arr);
    }

}
