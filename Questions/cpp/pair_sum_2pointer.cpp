#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,k;
    cin>>n>>k;
    int arr[n];
    for(int i =0 ;i < n ; i++)
        cin>>arr[i];
    sort(arr,arr+n);
    int flag = 0;
    int x=0,y=n-1;
    while(x < y)
    {
        if(arr[x]+arr[y] == k)
        {
            flag = 1;
            break;
        }
        else if(arr[x] + arr[y] > k)
            y--;
        else
            x++;
    }
    if(flag == 1)
        cout<<"YES";
    else
        cout<<"NO";
}