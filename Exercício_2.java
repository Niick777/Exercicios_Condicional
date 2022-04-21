import java.util.Scanner;


public class Exercício_2 {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int x=0;
		int y=0;
		int soma=x+y;
		
		System.out.print("Digite um número inteiro: ");
		x = entrada.nextInt();
		System.out.print("Digite outro número inteiro: ");
		y = entrada.nextInt();
		soma = x+y;
		
		if(soma > 10)
			System.out.printf("O resultado da soma é %d\n",soma);
		
		else if(soma < 10)
		System.out.println("Não é possível exibir um resultao menor que 10.");
		
	}

}
