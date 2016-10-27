#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <functional>
 
using namespace std;
		
int main(){
	int t;
	cin>>t;
	bool r[t];
	for (int i=0; i<t;i++){
		int n;
		cin>>n;
		int a[n];
 
		for (int j=0; j<n; j++){
			cin>>a[j];
		}
		vector<int> myvector (a, a+n);  
		
		sort(myvector.begin(), myvector.end());
		
		bool aja=true;
		int j=1;
		while (j<n && aja==true){
			if (a[j-1]-a[j]>1 || a[j-1]-a[j]<-1){
				aja=false;
			}
			j++;
		}
		if (aja==false){
			cout<<"NO"<<endl;
		}else{
			cout<<"YES"<<endl;
		}
	}
} 
