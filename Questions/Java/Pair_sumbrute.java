import java.util.*;

class Pair_sumbrute
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int k= sc.nextInt();
        int i=0,j=0,flag=0;

        int[] arr= new int[n];
        for(i =0 ;i < n ; i++)
            arr[i]= sc.nextInt();

        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(k==(arr[i]+arr[j]))
                {
                    System.out.println("YES");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("NO");
        }
    }
}