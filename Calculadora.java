package p2;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @AndreVicor - 123210703
 */

import java.util.Scanner;
import java.util.Locale;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		String operador = scanner.next();
		
		double resultado = 0.0;
		
		if (operador.equals("+") || operador.equals("-")  || operador.equals("*") || operador.equals("/")) {
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			
			if (operador.equals("+")) {
				resultado = a + b;	
				System.out.print("RESULTADO: " + resultado);
			}
		
			else if (operador.equals("-")){
				resultado = a - b;
				System.out.print("RESULTADO: " + resultado);
				
			}
			
			else if (operador.equals("*")) {
				resultado = a * b;
				System.out.print("RESULTADO: " + resultado);
				
			}
			
			else if (operador.equals("/") & b != 0){
				resultado = a / b;
				System.out.print("RESULTADO: " + resultado);
				
			}
			
			else if (operador.equals("/") & b == 0) {
				System.out.println("ERRO");
			}
		}
		
		else {
			System.out.println("ENTRADA INVALIDA");
		}
		
		scanner.close();
	}

}
