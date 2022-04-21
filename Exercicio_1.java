import java.util.Scanner;


public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int x;
		
		System.out.print("Digite um número inteiro: ");
		x = entrada.nextInt();
		
		if(x > 20)
			System.out.println("o número é "+x+".");
		
		else if(x < 20)
		System.out.println("Impossível exibir um número menor que 20.");
	}

}
