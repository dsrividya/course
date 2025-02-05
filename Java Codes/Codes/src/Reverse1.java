public class Reverse1 {
    public static String str(String st)
    {
        String reversed=" ";
        for(int i= st.length()-1;i>=0;i--)
        {
            reversed += st.charAt(i);
        }
        return reversed;

    }
    public static void main(String[] args)
    {

        String st = "Hello World!";
        String sta =Reverse1.str(st);
        System.out.println(sta);

    }
}

