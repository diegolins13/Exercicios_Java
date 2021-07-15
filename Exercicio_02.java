import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double media;
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();		
		sc.close();
		media = (nota1 + nota2)/2;
		System.out.println("Sua média é " + media);
		

	}

}
