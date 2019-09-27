import java.util.*;

class Selection_sort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		/* code */
		int n= sc.nextInt();	//Input length of array = n 
		int[] ar= new int[n];		//Declare an array 'ar' of length n
		// Accepting values for the array
		for(int i=0;i<n;i++)
		{
			ar[i]= sc.nextInt();
		}

		int min_index;					
		for(int i=0;i<n;i++)
		{
			min_index=i;						
			for(int j=i;j<n;j++)
			{
				if(ar[j]<ar[min_index])
				{		//comparing value at j-th index and min_index
					min_index=j;			
				}
			}
			//Placing minimum element at the correct place by swapping
			int temp = ar[min_index];
			ar[min_index] = ar[i];
			ar[i] = temp;
		}

		// Display the array
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+"\t");
	}
}