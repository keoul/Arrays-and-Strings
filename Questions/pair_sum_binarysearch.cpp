#include<bits/stdc++.h>
using namespace std;

bool binary_search(int arr[] ,int key,int n,int i)
{
    int mid,left = i+1, right = n - 1;
   
    while(left<right)
    {
        mid = (right+left)/2;
        if(arr[mid]>key)
            right = mid - 1;
        else if(arr[mid] < key)
            left = mid + 1;
        else
            return 1;
    }
    return 0;
}

int main()
{
    int n,k;
    cin>>n>>k;
    int arr[n];
    int flag = 0;
    for(int i = 0; i < n ; i++)
    {
        cin>>arr[i];
    }
    sort(arr,arr+n);
    for(int i = 0 ; i < n ; i++)
    {
        int t = k - arr[i];
        if(binary_search(arr,t,n,i) == 1)
        {
            flag = 1;
            break;
        }
    }
    if(flag == 0)
        cout<<"NO";
    else 
        cout<<"YES";
        
    
}