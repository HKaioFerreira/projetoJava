package aulaboa;
import java.util.Scanner;
public class Exerc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner m = new Scanner(System.in);
		int num1 , num2 , num3 ,local , local1;
		System.out.println("Insira o primeiro n�mero: \n");
		num1= m.nextInt();
		System.out.println("Insira o segundo n�mero: \n");
		num2= m.nextInt();
		System.out.println("Insira o terceiro n�mero: \n");
		num3= m.nextInt();

		if(num3>num2 && num3>num1) {
			local= num3;
		}
		else if (num2>num1 && num2>num3) {
			local= num2;
		}
		else {
			local = num1;
		}
			
		if(num3<num2 && num3<num1) {
			local1= num3;
		}
		else if (num2<num1 && num2<num3) {
			local1= num2;
		}
		else {
			local1 = num1;
		}
	
		System.out.println("O menor n�mero �:" +local1 +"\nO maior n�mero �:" +local);
			m.close();
		}
	
	}
	


