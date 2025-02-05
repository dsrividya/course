public class Words {

    public static String word(String st)
    {
        String[]  str=st.split(" ");
        StringBuilder sta= new StringBuilder();
       for(int i=str.length-1;i>=0;i--)
       {

           sta.append(str[i]);
           if(i!=0)
           {
               sta.append(" ");
           }
       }
       return sta.toString();
    }

    public static void main(String[] args)
    {
       String st="sri vidya";
       System.out.println(Words.word(st));
    }
}
