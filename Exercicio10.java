import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.print("Digite a hora inicial: ");
		horaInicial = sc.nextInt();
		System.out.print("Digite a hora final: ");
		horaFinal = sc.nextInt();
		if (horaInicial<horaFinal) {
			duracao = horaFinal-horaInicial;
		}
		else{
			duracao = 24 - horaFinal+horaInicial;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();
	}
}
