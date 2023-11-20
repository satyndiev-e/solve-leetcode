import java.util.*;

public class p1342 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();

        if(num == 0)
        {
            System.out.println(num);
        }

        int count = 0;
        do {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            count++;
        } while (num != 0);

        System.out.println(count);
    }
}
