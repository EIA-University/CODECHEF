    import java.util.Scanner;
     
    public class fenWiter {
     
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		Scanner sc = new Scanner(System.in);
    		int t;
    		double n;
    		char a = '1';
    		String l1,l2,l3;
    		String lo;
    		String lf="";
    		String lr="";
    		t = sc.nextInt();
    		int v[] = new int[t];
    		
    		for (int i = 0; i < t; i++) {
    			int cont=0;
    			l1 = sc.next();
    			l2 = sc.next();
    			l3 = sc.next();
    			n= sc.nextDouble();
    			lr="";
    			
    			for (int j = 0; j < n; j++) {
    				lr = lr+ l2;
    			}
    			
    			lf = l1 + lr + l3;
    			lo=lf;
    			
    			int r;
    			
    			while(lf.contains("1")){
    						
    				char [] temp=lf.toCharArray();
    				char [] temp2=lo.toCharArray();
    				
    				r=temp.length - 1;
    				
    				//if(lf.charAt(r)=='1'){
    				if(temp[r]=='1'){
    					//while(lf.charAt(r)=='1'){
    					while(temp[r]=='1'){
    						temp2[r]='0';
    						//System.out.println(temp[r]);
    						/*lo=lo.replace(lo.charAt(r), '0');
    						lo=lo.replace(lo.charAt(r-1), '1');*/
    						r--;
    					}
    					temp2[r]='1';
    				}else{
    					temp2[r]='1';
    					//lo=lo.replace(lo.charAt(r), '1');
    				}
    				
    				
    				for (int j = temp.length-1; j > 0; j--) {
    					if(temp[j]=='1' && temp2[j]=='1'){
    					//if((lf.charAt(j)=='1') && (lo.charAt(j)=='1')){
    						temp[j]='1';
    						//lf=lf.replace(lf.charAt(j), '1');
    					}else{
    						temp[j]='0';
    						//lf=lf.replace(lf.charAt(j), '0');
    					}
    				}
    					
    					r=temp.length-1;
    					lf=new String(temp);
    					
    					if(lf.contains("1")){
    				
    					//if(lf.charAt(r)==0){
    					if(temp[r]=='0'){
    						//while(lf.charAt(r)=='0'){
    						while(temp[r]=='0'){
    							temp[r]='1';
    							//lf=lf.replace(lo.charAt(r), '1');
    							r--;
    						}
    						temp[r]='0';
    						//lf=lf.replace(lo.charAt(r), '0');
    					}else{
    						temp[r]='1';
    						//lo=lo.replace(lo.charAt(r), '1');
    					}
    					}
    					lf=new String(temp);
    					lo=new String(temp);
    					cont++;
    				}
    			v[i]=cont;
    			cont = 0;
    			}
    		
    		
    	for (int j = 0; j < v.length; j++) {
    		System.out.println(v[j]);
    	}
    		//System.out.print(cont);
    		}
    		
    } 
