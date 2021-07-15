import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtd; 
		double n1, n2, n3, media=0;
		
		System.out.print("Digite quantas medias ponderadas deseja: ");
		qtd = sc.nextInt();
		System.out.println("--------------------");
		for (int i=0; i<qtd; i++) {
			System.out.print("Digite a primeira nota: ");
			n1 = sc.nextDouble();
			System.out.print("Digite a segunda nota: ");
			n2 = sc.nextDouble();
			System.out.print("Digite a terceira nota: ");
			n3 = sc.nextDouble();
			media = (n1*2.0 + n2*3.0 + n3*5.0)/10;
			System.out.printf("Media %.1f%n", media);
			System.out.println("--------------------");
			System.out.println();
		}
		sc.close();
	}

}
