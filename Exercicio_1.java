import java.util.Scanner;


public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int x;
		
		System.out.print("Digite um n�mero inteiro: ");
		x = entrada.nextInt();
		
		if(x > 20)
			System.out.println("o n�mero � "+x+".");
		
		else if(x < 20)
		System.out.println("Imposs�vel exibir um n�mero menor que 20.");
	}

}
