#include <stdio.h>
#include <iostream>
#include <string>
#include <vector>
 
using namespace std;

int main(){
	
	
	int t;
	scanf("%i",&t);
	
	for(int i = 0; i<t; i++){
		
		int k;
		scanf("%i",&k);
		
		int valores[k];
		int matriz[k][k];
		
		for(int j =0; j < k;j++){
			valores[j]=j+1;
		}
		int temp = valores[0];
		valores[0]=valores[k/2];
		valores[k/2]= temp;
		
		for(int j =0; j < k; j++){
				int contador =0;
				for(int z = j; z<k; z++){
					
					matriz[j][z]= valores[contador];
					contador++;
				}
			
				for(int z=0; z < j ;z++ ){
					matriz[j][z]= valores[contador];
					contador++;
				}
		}
		for(int j=0;j<k;j++) { 
			for(int z=0;z<k;z++){
				if(z == k-1){
					cout << matriz[j][z];
				}
						
				else{
					cout<<matriz[j][z]<< " ";
				} 
				
			} 
			cout<<endl;
		}	 
	}	
 
 
}
