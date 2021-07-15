import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		double horaTrab, valorHora, salario;
		
		System.out.print("Digite o numero do funcionário: ");
		numero = sc.nextInt();
		System.out.print("Digite as horas trabalhadas: ");
		horaTrab = sc.nextDouble();
		System.out.print("Digite o valor por hora trabalhada: ");
		valorHora = sc.nextDouble();
		salario = horaTrab * valorHora;
		System.out.println("Numero: " + numero);
		System.out.printf("Salario = R$ %.2f%n", salario);
		sc.close();

	}

}
