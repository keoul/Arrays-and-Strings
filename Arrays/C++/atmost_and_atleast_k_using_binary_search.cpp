#include<bits/stdc++.h>
using namespace std;
int atmost_k(int a[],int val,int n){

	int low = 0 , high = n-1;
	while(low < high){

		int mid = (low+high+1)/2;

		if(a[mid] <= val)
			low = mid;
		else
			high = mid-1;
	}
	if(a[low]<=val){
		return a[low];
	}
	else
		return INT_MIN;
}
int atleast_k(int a[],int val, int n){

	int low = 0 , high = n-1;
	while(low < high){

		int mid = (low+high)/2;

		if(a[mid] >= val)
			high = mid;
		else
			low = mid+1;
	}
	if(a[low]>=val){
		return a[low];
	}
	else
		return INT_MIN;
}

int main(){
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++){
		cin>>a[i];
	}
	int k;
	cin>>k;

	cout<<"Atleast k = "<<atleast_k(a,k,n)<<endl;
	cout<<"Atmost k = "<<atmost_k(a,k,n);
}
