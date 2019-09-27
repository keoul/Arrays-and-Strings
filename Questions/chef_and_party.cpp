#include<bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin>>t;
    for(int k=0;k<t;k++)
    {
       int n;
       cin>>n;
       std::vector<int> v(n,0);
       int inp;

       for(int i=0;i<n;i++)
       {
         cin>>v[i];
       }

       sort(v.begin(),v.end());

       int count=0;
       for(int i=0;i<n;i++)
       {

            if(v[i]<=count)
            {
                count++;
            }
            else
            {
                break;
            }
       }

       cout<<count<<endl;
    }

    return 0;
  }