import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A,B;
		
		System.out.print("Digite o primeiro numero: ");
		A = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		B = sc.nextInt();
		if (A%B==0 || B%A==0) {
			System.out.println("Os numeros são multiplos.");
		}
		else {
			System.out.println("Os numeros não são multiplos.");
		}
		sc.close();
	}	

}
