#include<bits/stdc++.h>
using namespace std;

int main()
{
	/* code */
	int n;			
	cin>>n;		//Input length of array = n 
	int ar[n];		//Declare an array 'ar' of length n

	// Accepting values for the array
	for(int i=0;i<n;i++){
		cin>>ar[i];
	}

	// Bubble Sort
	for(int i=0;i<n;i++){
		for(int j=0;j<n-i-1;j++){
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
		cout<<ar[i]<<" ";
	return 0;
}