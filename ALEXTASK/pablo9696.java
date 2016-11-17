import java.util.ArrayList;
import java.util.Scanner;
 
class mcm {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int numeros =0;
		long[] respuestas = new long[t];
 
		for(int i =0; i < t; i++){
			numeros= scan.nextInt();
			long[] valores = new long[numeros];
			
			for(int j =0; j < numeros; j++){
				valores[j]= scan.nextLong();
			}
			long menor = valores[0]* valores[1];
			for(int j =0; j < numeros-1; j++){
				for(int k = j+1; k < numeros; k++){
					long iaux;
					long mcm;
					valores[k] = Math.abs(valores[k]);
					valores[j] = Math.abs(valores[j]);
					long i1= Math.max(valores[k],valores[j]);
					long i2= Math.min(valores[k],valores[j]);
					do
					{
						iaux = i2;
						i2 = i1 % i2;
						i1 = iaux;
					} while (i2 != 0);
					mcm = (valores[k]/i1)*valores[j];  
					if(mcm < menor){
						menor = mcm;
					}
				}
			}
			respuestas[i] = (long) menor; 
		}
		for(int i =0; i < t; i++){
			System.out.println(respuestas[i]);
		}
 
	}
 
}
