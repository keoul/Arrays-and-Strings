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

	int min_index=0;					//initializing index of minimum element as 0
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++)
		{
			if(ar[j]<ar[min_index]){		//comparing value at j-th index and min_index
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
		cout<<ar[i]<<" ";
	return 0;
}