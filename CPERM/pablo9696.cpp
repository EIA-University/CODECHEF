#include <stdio.h>
#include <iostream>
#include <string>
#include <vector>
#include <math.h>
 
using namespace std;
unsigned potenciar(unsigned base, unsigned exponente, unsigned mod)
{
	
	unsigned long long n = base;
    unsigned long long test;
   
    for(test = 1; exponente; exponente >>= 1)
    {
        if (exponente & 1){
        	test = ((test % mod) * (n % mod)) % mod;
		}
    	n = ((n % mod) * (n % mod)) % mod;
    }
 
    return test; 
}
 
int main(){
 
	int t;
	scanf("%i",&t);
	long respuesta=1;
	long contador=1;
	for(int i =0; i < t; i++){
		int n;
		scanf("%i",&n);		
		contador =potenciar(2,n-1,1000000007);
		contador = contador -2;
		if(n ==1){
			cout<<0;
			cout<<endl;
		}
		else{
			respuesta= contador % 1000000007;
			cout<<respuesta;
			cout<<endl;
		}
	}
 
}  
