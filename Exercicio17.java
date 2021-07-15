import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool=0, gas=0, diesel=0, opcao;
		
		System.out.println("SELECIONE O COMBUSTIVEL DESEJADO");
		System.out.print("[1]Alcool  [2]Gasolina  [3]Diesel  [4]Sair : ");
		opcao = sc.nextInt();
		System.out.println();
		
		while (opcao != 4) {
			if (opcao == 1) {
				alcool += 1;
			}
			else if (opcao == 2) {
				gas += 1;
			}
			else if (opcao == 3) {
				diesel += 1;
			}
			else {
				System.out.println("Codigo invalido");
				System.out.println("---------------");
				System.out.println();
			}
			System.out.println("SELECIONE O COMBUSTIVEL DESEJADO");
			System.out.print("[1]Alcool  [2]Gasolina  [3]Diesel  [4]Sair : ");;
			opcao = sc.nextInt();
			System.out.println();
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println();
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
