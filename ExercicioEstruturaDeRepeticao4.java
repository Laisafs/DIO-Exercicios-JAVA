import java.util.Scanner;

public class ExercicioEstruturaDeRepeticao4 {

	public static void main(String[] args) {
		/*
		 * 🔸Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre
		 * a quantidade de números pares e a quantidade de números impares.
		 */

		Scanner scan = new Scanner(System.in);
		int numero;
		int quantidadePar=0;
		int count = 0;
		int quantidadeImpar=0;
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			count = count + 1;
			
			if (numero % 2 == 0) 
				{quantidadePar++;}
				
			
			else if (numero % 2 == 1) {
				quantidadeImpar++;
			};
				
				

		} while (count < 5);
		System.out.println("Quantidade de numeros pares: " + quantidadePar);
		System.out.println("Quantidade de numeros impares: " + quantidadeImpar );

	}

}
