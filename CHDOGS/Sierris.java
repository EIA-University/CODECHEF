import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s=0, tiempo=0;
		double v=0;
		Scanner scan = new Scanner(System.in);
		//System.out.println("T: ");
		int t= scan.nextInt();
		double respuestas[] = new double[t];
 
		for(int i=0; i<t; i++){
			//System.out.println("S: V: \n");
			s=scan.nextDouble();
			v=scan.nextDouble();
 
			tiempo=(s*2)/(3*v);
 
			respuestas[i]=tiempo;
			tiempo=0;
			s=0;
		}
		for(int j=0; j<t; j++){
			System.out.println(respuestas[j]);
		}
	}
 
}
