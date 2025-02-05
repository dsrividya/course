public class LowestBound
{
    public static int bound(int[] arr, int target)
    {
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]==target)
            {
                return i;
            }
         }
         return arr.length;
    }

    public static void main(String[] args)
    {
        int[] arr= {1,3,3,2,2};
        int target= 2;
        int i=LowestBound.bound(arr,target);
        System.out.println("index is at:"+i);
    }
}
