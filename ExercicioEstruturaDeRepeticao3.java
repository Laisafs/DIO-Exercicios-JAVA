import java.util.Scanner;

public class ExercicioEstruturaDeRepeticao3 {

	public static void main(String[] args) {
		
		/*Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.*/

		Scanner scan = new Scanner(System.in);

		int numero;
		int count = 0;
		int maior = 0;
		int soma = 0;
		int media;

		do {
			System.out.println("Número: ");
			numero = scan.nextInt();

			soma = soma + numero;

			if (numero > maior)
				maior = numero;
			count = count + 1;

		}

		while (count < 5);
		System.out.println("Número Maior: " + maior);

		media = soma / count;
		System.out.println("Média: " + media);

	}
}
