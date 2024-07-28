package p2;


/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @AndreVicor - 123210703
 */

import java.util.Scanner;

public class Wally {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder ultimoNome = new StringBuilder();
		
		while (true) {
			String suspeitos = scanner.nextLine();
			
			if (suspeitos.equals("wally")) {
				break;
			}
			
			String[] nomes = suspeitos.split(" ");
			String possivelNome = "?";
			
			for (String nome : nomes) {
				if (nome.length() == 5) {
					possivelNome = nome;
				}
				
			}
			
			ultimoNome.append(possivelNome).append("\n");
		}
		
		System.out.println(ultimoNome);
	}
}
