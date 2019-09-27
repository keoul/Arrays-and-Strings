import java.util.*;

class Pair_sumbin
{
    public static int binary_search(int arr[] ,int key,int n,int i)
    {
        int mid,left = i+1, right = n - 1;
    
        while(left<right)
        {
            mid = (right+left)/2;
            if(arr[mid]>key)
                right = mid - 1;
            else if(arr[mid] < key)
                left = mid + 1;
            else
                return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int k= sc.nextInt();

        int[] arr= new int[n];
        int flag = 0;
        for(int i = 0; i < n ; i++)
        {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0 ; i < n ; i++)
        {
            int t = k - arr[i];
            if(binary_search(arr,t,n,i) == 1)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("NO");
        else 
            System.out.println("YES");
    }
}