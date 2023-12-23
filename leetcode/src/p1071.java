import java.util.*;

public class p1071 {
    public static String gcdOfStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        String res = "";
        for (int i = minLength; i > 0; i--) {
            if (str1.length() % i == 0 && str2.length() % i == 0) {
                res = checkForValidity(i, str1, str2);
                return res;
            }
        }
        return res;
    }

    public static String checkForValidity(int gcd, String str1, String str2) {
        String substr = str1.substring(0, gcd);
        int div1 = str1.length() / gcd;
        int div2 = str2.length() / gcd;
        boolean check = false;

        String repeated1 = substr.repeat(div1);
        String repeated2 = substr.repeat(div2);

        if (repeated1.equals(str1) && repeated2.equals(str2)) check = true;
        return check ? substr : "";
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String s1 = inp.next();
        String s2 = inp.next();

        String res = gcdOfStrings(s1, s2);

        System.out.println(res);
    }
}
