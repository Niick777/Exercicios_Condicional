import java.util.Scanner;

public class Exerc�cio_6 {

	private static Scanner scanner1;

	public static void main(String[] args) {
		
		
	int x, y, z;
	int nota;
	
	
	System.out.print("Digite a nota da primeira avalia��o: " );
	try (Scanner scanner = new Scanner(System.in)) {
		x = scanner.nextInt();

		System.out.print("Digite a nota da segunda avalia��o: " );
		scanner1 = scanner;
		y = scanner1.nextInt();
		
		System.out.print("Digite a nota da terceira avalia��o: " );
		z = scanner.nextInt();
	}
 nota = (x * 2) + (y * 3) + (z * 5) / (10);
			
			if(nota >= 7) {
	System.out.println("Aluno aprovado." );
			}
			
	else {
		System.out.println("Aluno reprovado." );	
}
	}

	
}

