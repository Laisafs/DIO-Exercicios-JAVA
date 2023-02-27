import java.util.Scanner;

public class ExercicioEstruturaDeRepeticao2 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inválido e continue pedindo até que o usuário informe um
		 * valor válido
		 */

		Scanner scan = new Scanner(System.in);
		int nota;

		while (true) {

			System.out.println("Informe a nota: ");
			nota = scan.nextInt();

			if (nota >= 0 && nota <= 10)
				continue;
			else {

				break;

			}

		}
		System.out.println("Número Inválido");
	}
}
