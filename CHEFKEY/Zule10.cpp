    #include <iostream>
    #include <stdio.h>
    using namespace std;
     
    int main(){
     
    	int t;
    	cin>> t;
    	int sol[t];
    	int u;
    	for (int l = 0; l < t; l++)
    	{
    		int n,m,c;
    		 u=0;
    		 cin>>n;
    		 cin>>m;
    		 cin>>c;
    		for (int i = 1; i <= n; i++)
    		{
    			for (int j = 1; j <= m; j++)
    			{
    				if (i*j==c){
    					u++;
    					
    				}
    			}
     
    		}
    		sol[l]=u;
    	}
    	
    	for (int p = 0; p < t; p++)
    	{
    		cout << sol[p]<<"\n";
    	}
    } 
