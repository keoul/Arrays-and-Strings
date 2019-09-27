import java.util.*;

class Pair_sump
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int k= sc.nextInt();

        int[] arr= new int[n];
        for(int i =0 ;i < n ; i++)
            arr[i]= sc.nextInt();
        Arrays.sort(arr);
        int flag = 0;
        int x=0,y=n-1;
        while(x < y)
        {
            if(arr[x]+arr[y] == k)
            {
                flag = 1;
                break;
            }
            else if(arr[x] + arr[y] > k)
                y--;
            else
                x++;
        }
        if(flag == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}