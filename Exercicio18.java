import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite um valor entre 1 e 1000: ");
		x = sc.nextInt();
		for (int i=1; i<=x; i++) {
			if (x > 0 && x <= 1000) {
				if (i%2!=0) {
					System.out.println(i);
				}
			}
		}
		sc.close();
	}

}
