public class BinarySearch {
    public static int add(int[] arr, int target,int n)
    {
       int left= 0;
       int right=n-1;
       while(left<=right)
       {
         int mid=(left+right)/2;
         if(arr[mid]==target)
         {
             return mid;
         }
         else if(arr[mid]<target)
         {
            return right= mid-1;
         }
         else
         {
            return left=mid+1;
         }
       }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,9,8};
         int target= 3;
         int n=arr.length;
        int ind=BinarySearch.add(arr,target,n);
        if(ind==-1)
        {
            System.out.println("The target is not found");
        }
        else{
            System.out.println("The target is found:"+ ind);
        }
    }
}
