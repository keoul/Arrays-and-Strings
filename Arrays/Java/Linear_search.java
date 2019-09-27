import java.util.*;

class Linear_search
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	/* code */
		int n= sc.nextInt();				//Input length of array = n 
		int[] ar= new int[n];			//Declare an array 'ar' of length n

		// Accepting values for the array
		for(int i=0;i<n;i++)
		{
			ar[i]= sc.nextInt();;
		}
		int element= sc.nextInt();		//Declaring a variable element which needs to be searched for in the array

		//linear search
		int i;
		for(i=0;i<n;i++)
		{
			if(ar[i] == element)
			{
				System.out.println("element found at index = "+i);
				break;
			} 
		}
		if(i==n)
			System.out.println("Not found");
	}
}