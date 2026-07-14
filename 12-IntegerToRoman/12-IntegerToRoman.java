// Last updated: 14/07/2026, 14:32:24
class Solution {
    public static String intToRoman(int num) {

    String[] ch={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    int[] arr={1,4,5,9,10,40,50,90,100,400,500,900,1000};
    String s="";
    while(num>0)
    {
        for(int i =arr.length-1;i>=0;i--)
        {
            if(num>=arr[i])
            {
                num-=arr[i];
                s+=ch[i];
                break;
            }
        }
    }
    return s;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String val = intToRoman(n);
        System.out.println(val);
    }
}


        
    
