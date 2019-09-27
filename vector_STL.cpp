#include<bits/stdc++.h>
using namespace std;

void disp(vector < int > v)
{
	for(int i = 0 ; i < v.size() ; i++)
		cout<<v[i]<<"\t";
}

int main()
{
	vector <int> v;
	int n; 				//SIZE
	cin>>n;
	for(int i = 0 ;i < n; i++)
	{
		int k;
		cin>>k;
		v.push_back(k);
	}
	cout<<"Max Element is: "<<*max_element(v.begin(), v.end())<<endl; //Max Element

	cout<<"Min Element is: "<<*min_element(v.begin(), v.end())<<endl; // Min Element

	cout<<"The Sorted Vector is"<<endl;
	sort(v.begin(), v.end()); 				//Sorting
	disp(v);								// Display Method

	cout<<"\nEnter Element to Search"<<endl;
	int key;
	cin>>key;
	bool found = binary_search(v.begin(), v.end(),key); // Binary Search
	if(found == 1)
        cout<<"Found"<<endl;
    else
        cout<<"Not Found"<<endl;


	int sum = accumulate(v.begin(), v.end(),0); 		//Sums the vector
	cout<<"The sum is "<<sum<<endl;

	cout<<"Find Occurences of :"<<endl;
	int k;
	cin>>k;
	int freq = count(v.begin(), v.end(),k);
	cout<<freq<<endl;

    cout<<"Reverse Array is"<<endl;
	reverse(v.begin(), v.end());  			//Reverse the vector
	disp(v);

	v.clear();
	if(v.empty())
		cout<<"Vector is Empty!"<<endl;
	return 0;

}
