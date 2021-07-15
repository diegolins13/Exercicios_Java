import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("Digite o numero: ");
		num = sc.nextInt();
		System.out.println();
		System.out.println("RESULTADO");
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
