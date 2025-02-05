public class palindrome {
    public static boolean palin(String st)
    {
        int left=0; int right=st.length()-1;
        while(left<right)
        {
            if(st.charAt(left)!=st.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args)
    {
        String st= "madam";
        System.out.println(palindrome.palin(st));
    }
}
