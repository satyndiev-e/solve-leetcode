import java.util.*;

public class p1218 {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);

        int num = inp.nextInt();

        System.out.print(subtractProductAndSum(num));
    }
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n != 0){
             int rem = n % 10;
             sum += rem;
             product *= rem;
             n /= 10;
        }
        int max = Math.max(sum, product);
        int min = Math.min(sum, product);

        return max - min;
    }
}
