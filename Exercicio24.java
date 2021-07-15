import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		double quad=0, cubo=0;
		System.out.print("Digite o numero: ");
		num = sc.nextInt();
		System.out.println();
		for (int i=1; i<num; i++) {
			quad = Math.pow(i, 2);
			cubo = Math.pow(i, 3);
			System.out.printf(i+ " %.0f %.0f%n",quad, cubo);
		}
		sc.close();
	}

}
