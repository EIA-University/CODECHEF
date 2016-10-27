
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] respuestas = new int[t];
		
		for(int z= 0; z< t; z++){
			
			int n =  s.nextInt();
			int m =  s.nextInt();
			int c =  s.nextInt();

			int contador = 0;
			int j = 0;
			for(int i = 1; i<=n; i++){
				if(c % i ==0){
					j= (int) (c / i);
					if(i <= n && j <= m){
						contador++;
					}
				}
			}	
			respuestas[z] = contador;
			n=0;
			m=0;
			c=0;
		}
		for( int j=0; j < respuestas.length; j++){

			System.out.println(respuestas[j]);			
		}
	}
}
