class NumArray {
    int[] number;

    public NumArray(int[] nums) {
        number = nums;       
    }
    
    public int sumRange(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            result += number[i];
        }
        return result;        
    }
}
