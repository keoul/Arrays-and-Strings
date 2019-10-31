#include<bits/stdc++.h>
using namespace std;

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n,r;
		cin>>n>>r;
		int arr[n],steps = 0;
		cin>>arr[0];
		steps = arr[0]/r;
		for(int i = 1; i < n ;i++)
		{
			cin>>arr[i];
			steps += (arr[i] - arr[i-1] - 1)/r;
		}		
		cout<<steps<<endl;
	}	

}