import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtd, num, in=0, out=0;
		
		System.out.print("Digite a quantidade de numeros: ");
		qtd = sc.nextInt();
		for (int i=1; i<=qtd; i++) {
			System.out.print("Digite o "+ i +"º numero: ");
			num = sc.nextInt();
			if (num >= 10 && num <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		System.out.println();
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();	
	}

}
