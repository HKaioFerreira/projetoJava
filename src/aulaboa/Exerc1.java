package aulaboa;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner liil = new Scanner(System.in); 
		System.out.println("Digite um número");
		int leel = liil.nextInt() ;
		if(leel < 15) {
			System.out.print("Menor que 15");
		}
		else if(leel > 100) {
			System.out.println("Maior que 100");
			liil.close();
		}

}
}
