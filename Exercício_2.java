import java.util.Scanner;


public class Exerc�cio_2 {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int x=0;
		int y=0;
		int soma=x+y;
		
		System.out.print("Digite um n�mero inteiro: ");
		x = entrada.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		y = entrada.nextInt();
		soma = x+y;
		
		if(soma > 10)
			System.out.printf("O resultado da soma � %d\n",soma);
		
		else if(soma < 10)
		System.out.println("N�o � poss�vel exibir um resultao menor que 10.");
		
	}

}
