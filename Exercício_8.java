import java.util.Scanner;


public class Exercício_8 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		String senha;
		
		System.out.print("Digite a senha: ");
		senha = entrada.next();
		if(senha.equals("AEDB"))
			System.out.print("Acesso permitido.");		
		else
			System.out.print("Você não tem acesso ao sistema.");
		
	}
}
