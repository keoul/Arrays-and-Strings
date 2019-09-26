#include<bits/stdc++.h>
using namespace std;

int main()
{
	/* code */
	int m,n;                     //order of matric is m x n
	cin>>m>>n;

	int a[m][n];				 //Declaring a 2D array of 'm' rows and 'n' columns

	for(int i=0;i<m;i++){		 //Accepting values into the 2Darray
		for(int j=0;j<n;j++){
			cin>>a[i][j];
		}
	}

	int i, j, element;				//element to be found
	cin>>element;

	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
			if(a[i][j] == element)
				cout<<"Element found at position = ("<<i<<","<<j<<")";
		}
	}

	if(i==m && j==n){
		cout<<"element not found";
	} 
	return 0;
}