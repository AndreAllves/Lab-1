package p2;


/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @AndreVicor - 123210703
 */

import java.util.Scanner;

public class AcimaDaMedia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder resultado = new StringBuilder("");
		
		String linha = scanner.nextLine();
		
		String[] partes = linha.split(" ");
		
		int [] array = new int[partes.length];
		
		int i = 0;
		for (i = 0; i < partes.length; i++) {
			array[i] = Integer.parseInt(partes[i]);
		}
		
		
		int soma = 0;
		int j = 0;
		for (j = 0; j < array.length; j++) {
			soma += array[j];
		}
		
		double media = soma / array.length;
		
		for (int p = 0; p < array.length; p++) {
			if (array[p] > media) {
				if (resultado.length() > 0) {
					resultado.append(" ");
				}
				resultado.append(array[p]);
			}
		}
		System.out.println(resultado);
		scanner.close();
	}

}
