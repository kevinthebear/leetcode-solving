class Solution {
    public boolean isPowerOfThree(int n) {
        if (n<1) return false;
        if (n==1) return true;
        while (n>5) {
            if (n%3!=0) return false;
            n = n/3;
        }
        return (n%3==0);
    }
}
