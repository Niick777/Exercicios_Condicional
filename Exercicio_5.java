import java.util.Scanner;


public class Exercicio_5 {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número inteiro: ");
		x = entrada.nextInt();
		if(x %2== 0)
			System.out.println("o número é par.");
		else
			System.out.println("O número é ímpar.");
		
	}

}
