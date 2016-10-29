import java.util.Scanner;

class Hojas {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		long Mrojos = 0;
		long Mamarillos=0;
		long Mverdes =0;
		long Orojos = 0;
		long Oamarillos=0;
		long Overdes =0;
		long Projos = 0;
		long Pamarillos=0;
		long Pverdes =0;
		long totalM=0;
		long totalO=0;
		long totalP=0;
		long totalV=0;
		long totalA=0;
		long totalR=0;
		long[] totales = new long[6];
		long[] respuestas = new long[t];
		for(int i = 0; i < t ; i++){
			Mverdes = scan.nextLong();
			Mamarillos= scan.nextLong();
			Mrojos = scan.nextLong();
			Overdes = scan.nextLong();
			Oamarillos= scan.nextLong();
			Orojos = scan.nextLong();
			Pverdes = scan.nextLong();
			Pamarillos= scan.nextLong();
			Projos = scan.nextLong();
			totalM = Mverdes +Mamarillos +Mrojos;
			totalO = Overdes + Oamarillos + Orojos;
			totalP = Pverdes+Pamarillos+Projos;
			totalV = Mverdes+Overdes+Pverdes;
			totalA = Mamarillos + Oamarillos+Pamarillos;
			totalR = Mrojos+Orojos+Projos;
			totales[0] = totalM;
			totales[1] = totalO;
			totales[2] = totalP;
			totales[3] = totalV;
			totales[4] = totalA;
			totales[5] = totalR;
			long mayor=-1;
			for(int j =0; j< totales.length; j++){
				if(totales[j]>mayor){
					if(totales[j]%2==0){
						mayor= totales[j]-1;
					}
					else{
						mayor= totales[j];
					}
				}
			}
			if (mayor < 0){
				mayor=0;
			}
 
			respuestas[i]=mayor ;
 
		}
		for(int i =0; i < t; i++){
			System.out.println(respuestas[i]);
		}
	}
}
