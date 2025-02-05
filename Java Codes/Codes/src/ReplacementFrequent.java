import java.util.HashSet;

public class ReplacementFrequent {

    public static int replacement(String s) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> hs = new HashSet<>(); // Fix: Use Character instead of String

        for (int i = 0; i < s.length(); i++) {
            while (hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(left));
                left++;
            }

            hs.add(s.charAt(i));
            maxLength = Math.max(maxLength, i - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(ReplacementFrequent.replacement(str)); // Output: 3 (substring "abc")
    }
}
