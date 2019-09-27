import java.util.*;

class TwoD_array
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	/* code */
		int m= sc.nextInt();
		int n= sc.nextInt();//Input of m and n of m x n array

		int[][] a=new int[m][n];				 //Declaring a 2D array of 'm' rows and 'n' columns

		for(int i=0;i<m;i++)
		{		 //Accepting values into the 2Darray
			for(int j=0;j<n;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}

		int i, j=0, element;				//element to be found
		element= sc.nextInt();;

		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i][j] == element)
					System.out.println("Element found at position = ("+i+","+j+")");
			}
		}

		if(i==m && j==n)
		{
			System.out.println("element not found");
		}
	}
}