import java.util.*;

class Bubble_sort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		/* code */
		int n= sc.nextInt();		//Input length of array = n 
		int[] ar= new int[n];		//Declare an array 'ar' of length n

		// Accepting values for the array
		for(int i=0;i<n;i++)
		{
			ar[i]= sc.nextInt();;
		}

		// Bubble Sort
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(ar[j]>ar[j+1])             //Swapping values if value at j-th index is greater than that at j+1-th index
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}

		// Display the array
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+"\t");
	}
}