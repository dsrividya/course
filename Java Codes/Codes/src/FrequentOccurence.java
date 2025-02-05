import java.util.HashMap;

public class FrequentOccurence {
    public static char frequent(String st)
    {
        HashMap<Character , Integer> hp= new HashMap<>();
         for(int i=0; i<st.length();i++)
         {
             hp.put(st.charAt(i), hp.getOrDefault(st.charAt(i),0)+1);
         }
        for(int i=0;i<st.length();i++)
        {
            if(hp.get(st.charAt(i))==1)
            {
                return st.charAt(i);
            }
        }
        return '\0';
    }
    public static void main(String [] args)
    {
            String st="swiss";
            System.out.println(FrequentOccurence.frequent(st));
    }
}
