import java.util.Set;

public class p345 {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of ('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u');

        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while(start < end) {
             while(start < end && !vowels.contains(word[start])) {
                    start++;
             }
             while(start < end && !vowels.contains(word[end])) {
                 end--;
             }

             char temp = word[start];
             word[start++] = word[end];
             word[end--] = temp;
        }
        return new String(word);
    }
}
