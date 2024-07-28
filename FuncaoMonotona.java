package p2;


/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @AndreVicor - 123210703
 */

import java.util.Scanner;

public class FuncaoMonotona {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 int c = scanner.nextInt();
		 int d = scanner.nextInt();
		 
		 if (a < b & b < c & c < d) {
			 System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
		 }
		 
		 else if (a > b & b > c & c > d) {
			 System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
		 }
		 
		 else {
			 System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		 }
		 
		 scanner.close();
	}

}
