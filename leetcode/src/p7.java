public class p7 {
    public int reverse(int x) {
        int rev_n = 0;
        boolean isNeg = false;
        if(x < 0) {
            x *= -1;
            isNeg = true;
        }
        while(x > 0) {
            int rem = x % 10;
            x /= 10;

            if(rev_n > Integer.MAX_VALUE / 10 || rev_n < Integer.MIN_VALUE / 10){
                return 0 ;
            }
            rev_n = rev_n * 10 + rem;
        }
        return (isNeg) ? rev_n * -1 : rev_n;
    }
}
