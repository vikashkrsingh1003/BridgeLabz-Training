class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = n;

        for (int i = 0; i < n; i++) {
            xor ^= i;
            xor ^= nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(nums));
    }
}
