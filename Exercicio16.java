import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		
		System.out.print("Digite a cordenada de X: ");
		x = sc.nextDouble();
		System.out.print("Digite a cordenada de Y: ");
		y = sc.nextDouble();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
				System.out.println();
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo");
				System.out.println();
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
				System.out.println();
			}
			else{
				System.out.println("Quarto");
				System.out.println();
			}
			System.out.print("Digite a cordenada de X: ");
			x = sc.nextDouble();
			System.out.print("Digite a cordenada de Y: ");
			y = sc.nextDouble();
		}
		sc.close();
	}

}
