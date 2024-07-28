package p2;


/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @AndreVicor - 123210703
 */

import java.util.Locale;
import java.util.Scanner;

public class PassouOuNao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        
        double media = (nota1+nota2) / 2;
        
        if (media >= 7.0) {
            System.out.println("pass: True!");
        } else {
            System.out.println("pass: False!");
        }
        
        scanner.close();
    }
}
