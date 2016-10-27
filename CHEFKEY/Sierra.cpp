#include <iostream>
#include <vector>
#include <stdio.h>
#include <vector>
using namespace std;
 
int main(){
	int t,n,m,c,k;
	int contRes=0;
	
	scanf("%d", &t);
 
	int respuestas[t];
 
	for(int cont=0; cont<t; cont++){
		scanf("%d %d %d", &n, &m, &c);
 
		for(int i=1; i<=n; i++){
			if(c%i==0){
				k=c/i;
				if(i<=n && k<=m)
					contRes++;
			}
		}
 
		respuestas[cont]=contRes;
		contRes=0;
		n=0;
		m=0;
		c=0;
	}
 
	for(int j=0; j<t; j++){
		printf("%d\n", respuestas[j] );
	}
}
 