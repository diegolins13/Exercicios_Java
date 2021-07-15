import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D, dif;
		
		System.out.print("Digite o primeiro numero: ");
		A = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		B = sc.nextInt();
		System.out.print("Digite o terceiro numero: ");
		C = sc.nextInt();
		System.out.print("Digite o quarto numero: ");
		D = sc.nextInt();
		dif = (A*B - C*D);
		System.out.println("A diferença é " + dif);
		sc.close();
	}

}
