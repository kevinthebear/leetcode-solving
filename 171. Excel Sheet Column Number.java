class Solution {
    public int titleToNumber(String columnTitle) {
        double result = 0;
        for(int i=1; i<=columnTitle.length(); i++) {
            char c = columnTitle.charAt(i-1);
            result += Math.pow(26, columnTitle.length()-i) * (c-64);
        }
        return (int)(Math.round(res));
    }
}
