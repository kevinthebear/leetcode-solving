class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            int one = num % 10;
            int ten = (num - one) / 10;
            num = ten + one;
        }
        return num;
    }
}
