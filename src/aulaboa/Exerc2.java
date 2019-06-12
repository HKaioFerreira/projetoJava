package aulaboa;
import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner meem = new Scanner(System.in);
		float naan = meem.nextFloat();
		if(naan >= 1.99 && naan <= 5.99) {
			System.out.println("Esta entre os valores");}
		else {
				System.out.println("Não esta entre os valores");
				meem.close();	
		}
		}
	}


