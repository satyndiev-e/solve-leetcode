import java.util.Scanner;

public class p771 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String jew = inp.next();
        String st = inp.next();


        System.out.println(numJewelsInStones(jew, st));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        char[] chars = jewels.toCharArray();
        char[] chars1 = stones.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars1.length; j++) {
                if(chars[i] == chars1[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
