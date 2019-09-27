#include<iostream>
using namespace std;
int main()
{
    long long int n;
    cin>>n;
    string str;
    cin>>str;
    long long int count=0;
    for(int i=0;i<n-2;i++)
    {
        if (str[i]=='0' && str[i+1]=='1' && str[i+2]=='0')
        {
            str[i+2]=1;
            count++;
        }

    }
    cout<<count<<endl;
}
