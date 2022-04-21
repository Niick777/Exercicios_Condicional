import java.util.Scanner;


public class Exercício_7 {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		int x;
		String nome1;
		int y;
		String nome2;
		System.out.print("Digite o nome da primeira pessoa: ");
		nome1 = entrada.next();
		System.out.print("Digite a idade da primeira pessoa: ");
		x = entrada.nextInt();
		System.out.print("Digite o nome da segunda pessoa: ");
		nome2 = entrada.next();
		System.out.print("Digite a idade da segunda pessoa: ");
		y = entrada.nextInt();
		if(x > y)
			System.out.print(""+nome1+", "+x+"anos.");
		else
			System.out.print(""+nome2+", "+y+"anos.");
	}

}
