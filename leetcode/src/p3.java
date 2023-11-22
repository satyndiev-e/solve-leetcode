public class p3 {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        int keepTrackMax = 0;

        for (int i = 0; i < size; i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < size; j++) {
                if (!visited[s.charAt(j)]) {
                    keepTrackMax = Math.max(keepTrackMax, j - i + 1);
                    visited[s.charAt(j)] = true;
                } else {
                    break;
                }
            }
            visited[s.charAt(i)] = false;
        }
        return keepTrackMax;
    }
}
