import java.util.Scanner;
import java.util.Stack;

class palindromo {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		String numero = "";
		Stack<Character> pila = new Stack<Character>();
		String numero2="";
		String[] respuestas = new String[t];
		for(int i = 0; i < t; i++){
			numero= scan.next();
			numero2="";
			for(int j = 0; j< numero.length();j++){
				pila.push(numero.charAt(j));
			}
			for(int j = 0; j< numero.length();j++){
				numero2 = numero2 + pila.pop();
			}
			if(numero2.equals(numero)){
				respuestas[i] = "wins";
			}
			else{
				respuestas[i] = "losses";
			}
		}

		for(int i = 0; i<respuestas.length;i++){
			System.out.println(respuestas[i]);
		}
	}
} 
