#include<bits/stdc++.h>
using namespace std;

int main()
{
	/* code */
	int n;			
	cin>>n;				//Input length of array = n 
	int ar[n];			//Declare an array 'ar' of length n

	// Accepting values for the array
	for(int i=0;i<n;i++){
		cin>>ar[i];
	}
	int element;		//Declaring a variable element which needs to be searched for in the array
	cin>>element;

	//linear search

	for(int i=0;i<n;i++){
		if(ar[i] == element)
		{
			cout<<"element found at index = "<<i;
			break;
		} 
	}

	return 0;
}