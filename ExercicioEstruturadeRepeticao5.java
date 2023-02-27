import java.util.Scanner;

public class ExercicioEstruturadeRepeticao5 {

	public static void main(String[] args) {

		/*
		 * Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
		 * qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero
		 * ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
		 */

		Scanner scan = new Scanner(System.in);
		int numero;
		int tabuada;

		System.out.println("Digite o numero da tabuada que deseja verificar: ");
		numero = scan.nextInt();
		
		System.out.println("TABUADA");
		
		for (int i = 0; i <= 10; i++) {
			tabuada = numero * i;

			System.out.println(numero + " x " + i + " = " + tabuada);

		}

	}
}
