public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int size = nums.length;// Find the size of array
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < size; i++) {
            xor2 = xor2 ^ nums[i]; // Take xor of all array element such that 0^4^1^2^3
            xor1 = xor1 ^ (i + 1); // Take xor of all number form 0 to n
        }
        return xor1 ^ xor2; // At final take xor of both xor1 and xor2
    }

    public static void main(String args[]) {
        int nums[] = { 4, 1, 2, 3, 0, 6 };
        int arr = missingNumber(nums);
        System.out.println(arr);
    }

}
