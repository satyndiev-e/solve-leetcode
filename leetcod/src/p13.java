import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        for (; ; ) {
            String st = inp.next();

            System.out.println(romanToInt(st));
        }
    }

    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                if (i == chars.length - 1) {
                    count += 1;
                    break;
                }
                if (chars[i + 1] == 'V' || chars[i + 1] == 'X') {
                    count -= 1;
                } else {
                    count += 1;
                }
            }
            if (chars[i] == 'V') {
                count += 5;
            }
            if (chars[i] == 'X') {
                if (i == chars.length - 1) {
                    count += 10;
                    break;
                }
                if (chars[i + 1] == 'L' || chars[i + 1] == 'C') {
                    count -= 10;
                } else {
                    count += 10;
                }
            }
            if (chars[i] == 'L') {
                count += 50;
            }
            if (chars[i] == 'C') {
                if (i == chars.length - 1) {
                    count += 100;
                    break;
                }
                if (chars[i + 1] == 'D' || chars[i + 1] == 'M') {
                    count -= 100;
                } else {
                    count += 100;
                }
            }
            if (chars[i] == 'D') {
                count += 500;
            }
            if (chars[i] == 'M') {
                count += 1000;
            }
            if (i == chars.length - 1) {
                break;
            }
        }
        return count;
    }
}
