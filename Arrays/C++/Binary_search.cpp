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

	sort(ar,ar+n);      //Sorting the array

	//Binary search
	int left, right, mid, flag=0;
	left = 0;
	right = n;

	while(left <= rights){

		mid=(left+right)/2;

		if(element < ar[mid]){
			right = mid-1;
		}

		else if(element > ar[mid]){
			left = mid+1 ;
		}
		else {
			flag=1;
			break;
		}
	}
	if(flag == 1){
		cout<<"Element found at "<<mid;
	}
	else
		cout<<"Element not found";

	return 0;
}
