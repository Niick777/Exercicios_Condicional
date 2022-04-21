import java.util.Scanner;


public class Exercício_3 {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um número inteiro: ");
		x = entrada.nextInt();
		if(x > 0)
			System.out.println("o número é positvo.");
		else if(x < 0)
		System.out.println("O número é negativo.");
		else
		System.out.println("O número é neutro.");
		
	}

}
