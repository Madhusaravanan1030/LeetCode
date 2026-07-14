// Last updated: 14/07/2026, 14:31:17
class Solution {
    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum = sum + (num - (num / 10) * 10); 
                num = num / 10; 
            }
            num = sum;
        }
        return num;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        addDigits(num);

    }
}