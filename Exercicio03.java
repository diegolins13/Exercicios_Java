import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
	//Ler o valor do raio de um ciculo e imprimir o valor da �rea;
	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
				
			double raio, area, pi = 3.14159;
			
			System.out.print("Digite o valor do raio do circulo: ");
			raio = sc.nextDouble();
			area = pi * Math.pow(raio,2);
			System.out.printf("A = %.4f%n",area);
			sc.close();			

	}

}
