import java.util.Scanner;


public class Exerc�cio_10 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		double h = 72.7;
	       double m = 62.1;
	          String sexo; 
	          String homem = "Masculino" ;
	          String mulher = "Feminino";    
	       double altura;
	System.out.println("Qual � seu sexo (Masculino ou Feminino)?");
	sexo = entrada.next();
	System.out.println("Qual � sua altura?(coloque v�rgula entre os n�meros)");
	altura = entrada.nextDouble();
	if(sexo.equalsIgnoreCase(homem)) {
		System.out.printf("Seu peso ideal �: "+((h*altura)-58));
		}
	else if(sexo.equalsIgnoreCase(mulher)) {
		System.out.printf("Seu peso ideal �: "+((m*altura)-44.7));
	}


	    

	    }
	}
