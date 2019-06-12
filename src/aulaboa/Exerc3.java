package aulaboa;
import java.util.Scanner;
public class Exerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner paap = new Scanner(System.in);
		int reer = paap.nextInt();
		switch(reer) {
		case 0:
			System.out.print("Domingo");
			break;
		case 1:
			System.out.print("segunda");
			break;
		case 2:
			System.out.print("Terça");
			break;	
		case 3:
			System.out.print("Quarta");
			break;
		case 4:
			System.out.print("Quinta");
			break;
		case 5:
			System.out.print("Sexta");
			break;
		case 6:
			System.out.print("Sabado manito");
			break;
		default :
		System.out.print("número invalido");
		break;
		}	
		paap.close();
	}
}
