import java.util.*;

public class p1108 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String str = inp.nextLine();

        System.out.println(defangIPaddr(str));
    }
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
