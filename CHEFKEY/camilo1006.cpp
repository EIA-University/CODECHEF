#include <iostream>
#include <vector>
using namespace std;
 
int main(){
	int t;
	scanf("%i",&t);
	int r[t];
	int d[t][3];
	for (int i=0; i<t; i++){
		scanf("%i %i %i",&d[i][0], &d[i][1], &d[i][2]);
	}
	
	for (int i=0; i<t; i++){
		int res=0;
		int m,n;
		m=d[i][2];
		n=1;
		int j=1;
		if (m<=d[i][0]){
			if (n<=d[i][1]){
				res++;
			}
		}
		while(j<(d[i][2]/2)+1){
			if ((d[i][2]%j)==0){
				m=j;
				n=d[i][2]/m;
				if (m<=d[i][0]){
					if (n<=d[i][1]){
						res++;
					}
				}
			}
		j++;
		}
		r[i]=res;		
	}
	for (int i=0; i<t;i++){
		printf("%i\n",r[i]);
	}
} 
