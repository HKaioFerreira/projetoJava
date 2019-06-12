package aulaboa;

public class ExemploElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 20;
		if(idade <= 12) {	
			System.out.println ("criança");
		}
		else if(idade <=19) {
			System.out.println("Adolecente");
		}
		else if(idade <=60) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
}
}
}