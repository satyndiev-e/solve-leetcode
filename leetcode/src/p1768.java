class p1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int idx = 0;
        while(idx < w1.length || idx < w2.length) {
            if(idx < w1.length)
                s.append(w1[idx]);
            if(idx < w2.length)
                s.append(w2[idx]);
            idx++;
        }
        return s.toString();
    }
}