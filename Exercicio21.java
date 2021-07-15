import java.util.Locale;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double qtd, n1, n2;
		double divisao;
		
		System.out.print("Digite a quantidade de numeros desejado: ");
		qtd = sc.nextInt();
		for (int i=0; i<qtd; i++) {
			System.out.print("Digite o primeiro numero: ");
			n1 = sc.nextDouble();
			System.out.print("Digite o segundo numero: ");
			n2 = sc.nextDouble();
			if (n2 == 0) {
				System.out.println("Divisao impossivel");
				System.out.println();
			}
			else {
				divisao = n1/n2;
				System.out.printf("RESULTADO: %.1f%n", divisao);
				System.out.println();
			}
		}		
		sc.close();
	}

}
