import java.util.*;
import java.util.ArrayList;

public class p151 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String s = inp.nextLine();


        String neu = reverseWords(s);

        System.out.println(neu);
    }
    // " hello world "
    public static String reverseWords(String s) {
        StringBuilder set = new StringBuilder();
        StringBuilder empty = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                if(!empty.isEmpty()) {
                    set.insert(0, empty + " ");
                }
                empty = new StringBuilder();
            }
            else {
                empty.append(s.charAt(i));
            }
        }
        if(!empty.isEmpty()) {
            set.insert(0, empty + " ");
        }

        return set.substring(0, set.length() - 1);
    }
}
