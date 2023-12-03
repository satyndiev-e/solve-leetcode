public class p6 {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder conv = new StringBuilder();

        int len = s.length();
        int dist = 2 * (numRows - 1);

        for (int i = 0; i < numRows; i++) {
            int dist_res = 2 * i;
            for (int j = i; j < len; j += dist_res) {
                conv.append(s.charAt(j));
                dist_res = dist - dist_res;
                dist_res = (dist_res == 0) ? dist : dist_res;
            }
        }
        return conv.toString();
    }
}
