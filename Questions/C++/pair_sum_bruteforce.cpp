#include<iostream>
using namespace std;
int main()
{
    int n,k;
    cin>>n>>k;
    int a[n];
    for(i=0;i<n;i++)
        cin>>a[i];

    int flag = 0;

    for(i=0;i<n;i++)
    {
        for(j=0;j<i;j++)
        {
            if(k==(a[i]+a[j]))
            {
                cout<<"YES"<<endl;
                flag=1;
                break;
            }
        }
    }
    if(flag==0){
        cout<<"NO"<<endl;
    }
    return 0;
}