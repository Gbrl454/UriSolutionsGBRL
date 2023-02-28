package UriSolutionsGBRL.Java.Iniciante;

//  Fibonacci Fácil
//    A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.
//
//        Entrada
//        O arquivo de entrada contém um valor inteiro N (0 < N < 46).
//
//        Saída
//        Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após o último valor.

import java.util.Scanner;

public class Q1151 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 2;
        long a = 0, b = 1;

        do {
            n = sc.nextInt();
        } while (n < 0 || n > 46);

        while (i < n) {
            System.out.print(a + " " + b + " ");
            a += b;
            b += a;
            i += 2;
        }

        if (i == n) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(a);
        }
    }
}