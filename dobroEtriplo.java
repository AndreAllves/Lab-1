package p2;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @AndreVicor - 123210703
 */


import java.util.Scanner;

public class dobroEtriplo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		int dobro = x * 2;
		int triplo = x * 3;
		
		System.out.println("dobro: " + dobro +", triplo: " + triplo);
		
		scanner.close();
	}

}
