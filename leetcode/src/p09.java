import java.util.*;

public class p09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int x = inp.nextInt();
        boolean check;

        int digit;
        while (x != 0) {
            digit = x % 10;
            list.add(digit);
            list2.add(digit);
            x /= 10;
        }
        Collections.reverse(list);
        check = list.equals(list2);
        System.out.println(check);
    }
}
