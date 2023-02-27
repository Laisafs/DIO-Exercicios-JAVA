import java.util.Scanner;

public class ExercicioEstruturDeRepeticao6 {

	public static void main(String[] args) {
		/*
		 * Fatorial: Faça um programa que calcule o fatorial de um número inteiro
		 * fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
		 */

		Scanner scan = new Scanner(System.in);

		int fatorial;

		System.out.println("Digite um numero para calculo do fatorial: ");
		fatorial = scan.nextInt();

		int multiplicacao = 1;

		for (int i = fatorial; i >= 1; i--) {
			System.out.println(fatorial--);

			multiplicacao = multiplicacao * i;

		}

		System.out.println(+multiplicacao);
	}

}
