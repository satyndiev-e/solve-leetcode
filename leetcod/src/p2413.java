import java.util.*;

public class p2413 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();
        System.out.println(smallestEvenMultiple(num));
    }
    public static int smallestEvenMultiple(int n) {
        int res;
        if(n % 2 == 0){
            res = n;
        }else {
            res = n * 2;
        }
        return res;
    }
}
