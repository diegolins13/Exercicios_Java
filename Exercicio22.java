import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, fat=1;
		
		System.out.print("Digite o numero que deseja o fatorial: ");
		num = sc.nextInt();
		for (int i=1; i<=num; i++) {
			fat = fat * i;
		}
		System.out.println(fat);
		sc.close();
	}
}
