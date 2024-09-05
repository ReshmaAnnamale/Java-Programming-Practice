class SingleNumber {
    public int singleNumber(int[] nums) {
         int ones = 0, twos = 0;

        for (int num : nums) {
            
            twos |= ones & num;
            ones ^= num;
            int common_mask = ~(ones & twos);
            ones &= common_mask;
            twos &= common_mask;
        }

        return ones;
    }
}