import java.util.Scanner;


public class Exerc�cio_3 {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um n�mero inteiro: ");
		x = entrada.nextInt();
		if(x > 0)
			System.out.println("o n�mero � positvo.");
		else if(x < 0)
		System.out.println("O n�mero � negativo.");
		else
		System.out.println("O n�mero � neutro.");
		
	}

}
