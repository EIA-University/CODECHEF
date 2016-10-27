import java.util.Scanner;
 
class arboldos {
 
	public static void main(String[] args) {
		int t,n;
		String l1, l2, l3, aux;
		String l="", tope="";
		double lt = 0b0;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		int c[]=new int [t];
		for (int i=0; i<t; i++){
			c[i]=0;
			l1=sc.next();
			l2=sc.next();
			l3=sc.next();
			n=sc.nextInt();
			aux=l2;
			//optimizacion con 2^n
			for (int j=0; j<n-1;j++){
				l2=l2+aux;
			}
			l=l1+l2+l3;
			int k=l.length()-1;
			if (l.charAt(k)=='0'){
				while (k>=0 && l.charAt(k)=='0'){
					k--;
				}
				c[i]=c[i]+2;
				k--;
				while (k>=0){
					if (l.charAt(k)=='1'){
						c[i]++;
					}
					k--;
				}
			}else{
				while (k>=0 && l.charAt(k)=='1'){
					k--;
				}
				c[i]++;
				k--;
				while (k>=0){
					if (l.charAt(k)=='1'){
						c[i]++;
					}
					k--;
				}
			}
		}
		for (int i=0; i<t; i++){
			System.out.println(c[i]);
		}
	}
}
