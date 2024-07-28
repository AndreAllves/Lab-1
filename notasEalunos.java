package p2;


/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @AndreVicor - 123210703
 */

import java.util.Scanner;

public class notasEalunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] notasDosAlunos = new int[800];
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
            
            if (cont < notasDosAlunos.length) {
                notasDosAlunos[cont] = nota;
                cont++;
            } else {
                break;
            }
            
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }

            soma += nota;
        }
        
        int media = cont > 0 ? (int) soma / cont : 0;
        
        for (int j = 0; j < cont; j++) {
            if (notasDosAlunos[j] >= 700) {
                contDenotasAcima++;
            } 
            
            else {
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
