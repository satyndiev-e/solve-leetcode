public class p1528 {
    public static String restoreString(String s, int[] indices) {
        String[] str = new String[s.length()];
        for (int i = 0; i < indices.length; i++) {

            str[indices[i]] = String.valueOf(s.charAt(i));
        }
        return String.join("", str);
    }
}
