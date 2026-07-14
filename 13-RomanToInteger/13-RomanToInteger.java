// Last updated: 14/07/2026, 14:32:26
class Solution {
    public static int romanToInt(String s) {
    
        String[] ch = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] arr = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        int num = 0;
        int i = 0;
        
        while (i < s.length()) {
            for (int j = ch.length - 1; j >= 0; j--) {
                if (s.startsWith(ch[j], i)) {
                    num += arr[j];
                    i += ch[j].length();
                    break;
                }
            }
        }
        return num;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.next();
        int val = romanToInt(roman);
        System.out.println(val);
    }
}
 
    
