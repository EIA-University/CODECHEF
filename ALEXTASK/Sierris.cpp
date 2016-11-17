#include <iostream>
#include <stdio.h>
#include <cmath>
using namespace std;
 
 
int mcd (int a, int b){
	int c;
	while (a!=b){
 
	if (a>b)
		a=a-b;
	else
		b=b-a;
	}
 
	c=a;
	return c;
}
 
int main(){
	int t=0, n=0;
	int aux;
	double respuesta; 
	scanf("%d", &t);
 
	for(int conTest=0;conTest<t;conTest++){
		scanf("%d", &n);
		int sensores[n];
		for(int contSensores=0; contSensores<n; contSensores++){
			scanf("%d", &sensores[contSensores]);
			//hasta acÃ�Â¡ estÃ�Â¡ bien
		}
		aux=sensores[0]*sensores[1]/mcd(sensores[0], sensores[1]);
		for(int i=0;i<n;i++){//Coge el primer tÃ�Â©rmino
			for(int j=i+1; j<n; j++){//Coge los tÃ�Â©rminos
				//siguientes y los compara con i
				respuesta=sensores[i]*sensores[j]/mcd(sensores[i], sensores[j]);
				if(aux>respuesta)
					aux=respuesta;
			}
		}
		cout << aux << "\n";		
	}
	return 0;
} 
