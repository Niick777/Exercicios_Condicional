import java.util.Scanner;


public class Exercício_9 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		float x;
		float maior;
		float menor;
				
		System.out.print("Digite o valor do produto: ");
		x = entrada.nextFloat();
		menor = (((45*x)/100) + x);
		maior = ((30 % x) + x);

		
		
		
		if(x < 20)
			System.out.printf("O produto ficou em: %f", menor);
		else
			System.out.printf("O produto ficou em: %f", maior);
		
	}

}
