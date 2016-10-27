#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <functional>
 
using namespace std;
		
int main(){
	int n;
	int m;
	cin>>n;
	cin>>m;
	int a[n];
	int f[m];
	int p[m];
	string s[m];
	int rs[m];
	int rn[m];
	for (int i=0; i<n;i++){
		cin>>a[i];
	}
	
	for (int i=0; i<m; i++){
		cin>>f[i];
		cin>>p[i];
		cin>>s[i];
	}
	
	int con=0;
	int cont=0;
	
	for (int i=0; i<m;i++){
		int j=0;
		while (j<n && f[i]!=a[j]){
			j++;
		}
		if (f[i]==a[j]){
			rs[con]=i;
			con++;
		}else{
			rn[cont]=i;
			cont++;
		}
	}
	
	for (int i=0; i<con; i++){
		int index=i;
		for (int j=i+1; j<con;j++){
			if (p[rs[j]]>p[rs[index]]){
				index=j;
			}
		}
		int temp=rs[index];
		rs[index]=rs[i];
		rs[i]=temp;
	}
	
		for (int i=0; i<cont; i++){
		int index=i;
		for (int j=i+1; j<cont;j++){
			if (p[rn[j]]>p[rn[index]]){
				index=j;
			}
		}
		int temp=rn[index];
		rn[index]=rn[i];
		rn[i]=temp;
	}
	
	for (int i=0; i<con;i++){
		cout<<s[rs[i]]<<endl;
	}
		for (int i=0; i<cont;i++){
		cout<<s[rn[i]]<<endl;
	}
} 
