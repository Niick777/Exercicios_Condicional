import java.util.Scanner;


public class Exercicio_5 {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um n�mero inteiro: ");
		x = entrada.nextInt();
		if(x %2== 0)
			System.out.println("o n�mero � par.");
		else
			System.out.println("O n�mero � �mpar.");
		
	}

}
