import java.util.*;

public class p66 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        for(; ;) {
            long x = inp.nextLong();
            String s = Long.toString(x);
            String[] str = s.split("");
            int[] array = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            System.out.println(Arrays.toString(plusOne(array)));
        }
    }
    public static int[] plusOne(int[] digits) {
        int[] cp = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--)
        {
            digits[i] += 1;
            if(digits[i] > 9){
                digits[i] %= 10;
                if(i == 0){
                    cp[i] = 1;
                }
            }
            else{
                return digits;
            }
        }
        return cp;
    }
}
