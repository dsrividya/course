public class ReverseOtherSwap {

    public static String swap(String st)
    {
        char[] arr=st.toCharArray();
        int left=0;
        int right=st.length()-1;
        while(left<right)
        {
            char temp= arr[left];
            arr[left]=arr[right];
            arr[right]= temp;
            left++;
            right--;

        }

        return new String(arr);

    }
    public static void main(String[] args)
    {
        String st="sri vidya";
       System.out.println(swap(st));
    }
}
