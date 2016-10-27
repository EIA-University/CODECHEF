import java.util.Scanner;

class perros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		double[] respuestas = new double[t];
		
		for (int i = 0; i < t; i++){
			double s = scan.nextInt();
			double v = scan.nextInt();
			double aux= (2*s)/(3*v);
			respuestas[i] = aux;
		}
		for(int j = 0; j< respuestas.length; j++){
			System.out.println(respuestas[j]);
		}
		
	} 

}
