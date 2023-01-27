import java.util.*;

public class p14 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String word = inp.nextLine();
        String[] newStr = word.split(" ");

        System.out.println(longestCommonPrefix(newStr));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String temp = strs[0];
        for(int i = 0; i < strs.length; ++i)
        {
            if(i == strs.length - 1) break;
            for (int j = 0; j < temp.length(); j++) {
                if(temp.charAt(j) != strs[i + 1].charAt(j))
                {
                    temp = temp.substring(0, j);
                }
            }
        }
        return temp;
    }
}
