import java.util.Arrays;

public class Anagrams {
    public static boolean anagram(String s1, String s2)
    {
        if(s1.length()==0||s2.length()==0)
        {
            return false;
        }
        char[] s11= s1.toCharArray();
        char[] s22= s2.toCharArray();
        Arrays.sort(s11);
        Arrays.sort(s22);
        return Arrays.equals(s11,s22);

    }
    public static void main(String[] args)
    {
        String s1="race";
        String s2="cear";
        System.out.println(Anagrams.anagram(s1,s2));
    }
}
