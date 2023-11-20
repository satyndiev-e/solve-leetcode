import java.util.*;

public class p1688 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();

        System.out.println(numberOfMatches(num));
    }
    public static int numberOfMatches(int n) {
        int count = 0;
        int advanced = 0;
        while (n != 0){
            n += advanced;
            if(n % 2 == 0){
                count += n / 2;
            }else {
                count += (n - 1) / 2;
                advanced++;
            }
            n /= 2;
        }
        return count;
    }
}
