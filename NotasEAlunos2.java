package p2;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @AndreVicor - 123210703
 */

import java.util.Scanner;
import java.util.ArrayList;

public class NotasEAlunos2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> notasDosAlunos = new ArrayList<Integer>();
        int cont = 0;
        int contDenotasAcima = 0;
        int contDenotasAbaixo = 0;
        int maiorNota = Integer.MIN_VALUE;
        int menorNota = Integer.MAX_VALUE;
        int soma = 0;
        
        while (true) {
            String linha = scanner.nextLine();
            if (linha.equals("-")) {
                break;
            }
            
            String[] valores = linha.split(" ");
            int nota = Integer.parseInt(valores[1]);
            
            
            notasDosAlunos.add(nota);
            
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }

            soma += nota;
        }
        
        int media = notasDosAlunos.size() > 0 ? (int) soma / notasDosAlunos.size() : 0;
        
        for (int nota : notasDosAlunos) {
            if (nota >= 700) {
                contDenotasAcima++;
            } else {
                contDenotasAbaixo++;
            }
        }
        
        System.out.println("Maior: " + maiorNota);
        System.out.println("Menor: " + menorNota);
        System.out.println("Média: " + media);
        System.out.println("acima: " + contDenotasAcima);
        System.out.println("abaixo: " + contDenotasAbaixo);

        scanner.close();
    }
}
