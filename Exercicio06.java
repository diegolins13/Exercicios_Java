import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTri, areaCir, areaTrap, areaQua, areaRetan;
		double pi = 3.14159;
		
		System.out.print("Digite o primeiro valor: ");
		A = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
		B = sc.nextDouble();
		System.out.print("Digite o terceiro valor: ");
		C = sc.nextDouble();
		areaTri = (A*C)/2;
		areaCir = pi * Math.pow(C,2);
		areaTrap = ((A+B)*C)/2;
		areaQua = B*B;
		areaRetan = A*B;
		System.out.printf("TRIANGULO: %.3f%n", areaTri);
		System.out.printf("CIRCULO: %.3f%n", areaCir);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
		System.out.printf("QUADRADO: %.3f%n", areaQua);
		System.out.printf("RETANGULO: %.3f%n", areaRetan);
		sc.close();
	}

}
