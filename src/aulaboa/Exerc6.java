package aulaboa;
import java.util.Scanner;
public class Exerc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d = new Scanner(System.in);
		int n ;
		System.out.println("Digite um número");
		n =  d.nextInt();
		if(n % 2 == 0) {
			
			System.out.println("Par");
		}
		else {
			
			System.out.println("ímpar");
			d.close();
		}
	}
	}


