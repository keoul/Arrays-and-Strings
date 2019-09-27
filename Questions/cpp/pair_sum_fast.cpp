#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    vector <bool> v(1000000,0);
    int n,k;
    cin>>n>>k;
    int arr[n];
    int flag = 0;
    for(int i = 0; i < n ; i++)
    {
        cin>>arr[i];
       
    }
    for(int i = 0; i < n; i++)
    {
        int t = k - arr[i];
        
            if(v[t] == 1)
            {
                flag = 1;
                break;
            }
            v[arr[i]]=1;
            
    }
    if(flag == 0)
        cout<<"NO";
    else 
        cout<<"YES";
        
    
}