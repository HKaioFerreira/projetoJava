package aulaboa;
import java.util.Scanner;
public class Exerc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 =0 ,num2 =0 ,resultado ,num3 =0 , num4 =0;
	   
	       Scanner s = new Scanner(System.in);
	       
	       System.out.println("Introduza as notas");
	       num1 = s.nextInt();
	       num2 = s.nextInt(); 
	       num3 = s.nextInt();
	       num4 = s.nextInt();
	             
	     resultado = (num1 + num2 + num3 + num4)/4;
	     
	     if(resultado < 3) {
	    	 System.out.println("Retido");
	     }
	    else if(resultado >=6 ) {
	    	System.out.println("Aprovado");
	    }
	    else {
	    	System.out.print("Exame \n");
	    }
	    	 System.out.print("Média: " +resultado);
	    	 s.close();
}
}