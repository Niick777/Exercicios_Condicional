import java.util.Scanner;


public class Exercicio_4 {
	
	public static void main(String[] ars){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("Digite um n�mero inteiro: ");
		x = entrada.nextInt();
		System.out.print("Digite outro n�mero: ");
		y = entrada.nextInt();
		if( x > y)
			System.out.println("Os n�meros em ordem decrescente ficaram: "+x+" e "+y+".");
		else if(x < y)
			System.out.println("Os n�meros em ordem decrescente ficaram: "+y+" e "+x+".");
		else
			System.out.println("Os n�meros em ordem decrescente ficaram: "+x+" e "+y+".");
		
		
	}

}
