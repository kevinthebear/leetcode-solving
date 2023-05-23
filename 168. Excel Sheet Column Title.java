class Solution {
    public String convertToTitle(int num) {
        num -= 1;
        String output = "";
        while (num > -1){
            char letter = (char)(num % 26 + 'A');
            num = num / 26 - 1;
            output = Character.toString(letter) + output;
        }
        return output;
    }
}
