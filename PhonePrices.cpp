#include<bits/stdc++.h>
using namespace std;

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		vector < int > arr(n);
		int mini = 100000;
		int ans = 0;
		for(int i = 0; i < n; i++)
		{
		    cin>>arr[i];
			if(i < 5)
			{
				if(mini > arr[i])
				{
					ans++;
					mini = arr[i];
				}
			}
			if(i >=5)
			{
				if(*min_element(arr.begin()-5+i,arr.begin()+i) > arr[i])
                {
                    ans++;
                }
			}
		}
		cout<<ans<<endl;

	}
}
