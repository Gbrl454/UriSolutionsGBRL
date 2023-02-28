package UriSolutionsGBRL.Java.Iniciante;

//  Fatorial Simples
//    Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//
//        Entrada
//        A entrada contém um valor inteiro N (0 < N < 13).
//
//        Saída
//        A saída contém um valor inteiro, correspondente ao fatorial de N.

import java.util.Scanner;

public class Q1153 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i = 0;
        long res = 1;

        do {
            n = sc.nextInt();
        } while (n < 0 || n > 13);

        while (i < n) {
            res *= (n - i);
            i++;
        }

        System.out.println(res);
    }
}
