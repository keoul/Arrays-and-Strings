import java.util.*;

class Pair_sumfast
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int k= sc.nextInt();

        int[] arr= new int[n];
        arr[0] = sc.nextInt();
        int max = arr[0];
        for(int i =1 ;i < n ; i++)
        {
            arr[i]= sc.nextInt();
            if(max<arr[i])
                max = arr[i];
        }
        int[] v= new int[max+1];
        Arrays.fill(v,0);
        int flag =0;
        for(int i = 0; i < n; i++)
        {
            int t = k - arr[i];
            
                if(v[t] == 1)
                {
                    flag = 1;
                    break;
                }
                v[arr[i]]=1;
        }
        if(flag == 0)
            System.out.println("NO");
        else 
            System.out.println("YES");
    }
}