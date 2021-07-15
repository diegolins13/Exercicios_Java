import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.print("Digite o numero: ");
		number = sc.nextInt();
		if (number >= 0){
			System.out.println("O numero " + number + " é NÃO NEGATIVO.");
		}
		else {
			System.out.println("O numero " + number + " é NEGATIVO.");
		}
		
		sc.close();

	}

}
