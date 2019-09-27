import java.util.*;

class Selection_sort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		/* code */
		int t= sc.nextInt();	//Input length of array = n 
    for(int k=0;k<t;k++)
    {
       int n= sc.nextInt();
       int[] v=new int[n];

       for(int i=0;i<n;i++)
       {
         v[i]= sc.nextInt();
       }

       Arrays.sort(v);

       int count=0;
       for(int i=0;i<n;i++)
       {

            if(v[i]<=count)
            {
                count++;
            }
            else
            {
                break;
            }
       }

       System.out.println(count);
    }
  }
}