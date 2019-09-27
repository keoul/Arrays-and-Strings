import java.util.*;

class Binary_search
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
			ar[i]= sc.nextInt();
		}
		int element= sc.nextInt();	//Declaring a variable element which needs to be searched for in the array

		Arrays.sort(ar);      //Sorting the array

		//Binary search
		int left, right, mid, flag=0;
		left = 0;
		right = n;

		while(left <= rights)
		{

			mid=(left+right)/2;

			if(element < ar[mid])
			{
				right = mid-1;
			}

			else if(element > ar[mid])
			{
				left = mid+1 ;
			}
			else 
			{
				flag=1;
				break;
			}
		}
		if(flag == 1){
			System.out.println("Element found");
		}
		else
			System.out.println("Element not found");
	}
}
