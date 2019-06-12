package aulaboa;

public class ExemploIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 20;
		if(idade <=12) {
			System.out.println ("criança");
		}
		if(idade > 12 && idade <= 19) {
			System.out.println("adolesecente");
	}
		if(idade > 19 && idade <= 60) {
			System.out.println("adulto");
	}
		if(idade > 60) {
			System.out.println("idoso");
		}
		}		
}
