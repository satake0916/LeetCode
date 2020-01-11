class Solution {
    public String intToRoman(int num) {
        String[] one = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] ten = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] han = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tha = {"", "M", "MM", "MMM"};
        return tha[(num/1000)] + han[(num/100)%10] + ten[(num/10)%10] + one[num%10];
    }
}
