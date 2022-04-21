import java.util.Scanner;


public class Exercício_10 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		double h = 72.7;
	       double m = 62.1;
	          String sexo; 
	          String homem = "Masculino" ;
	          String mulher = "Feminino";    
	       double altura;
	System.out.println("Qual é seu sexo (Masculino ou Feminino)?");
	sexo = entrada.next();
	System.out.println("Qual é sua altura?(coloque vírgula entre os números)");
	altura = entrada.nextDouble();
	if(sexo.equalsIgnoreCase(homem)) {
		System.out.printf("Seu peso ideal é: "+((h*altura)-58));
		}
	else if(sexo.equalsIgnoreCase(mulher)) {
		System.out.printf("Seu peso ideal é: "+((m*altura)-44.7));
	}


	    

	    }
	}
