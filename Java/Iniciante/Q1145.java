package UriSolutionsGBRL.Java.Iniciante;

//  Sequência Lógica 2
//    Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.
//
//        Entrada
//        O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).
//
//        Saída
//        Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.

import java.util.Scanner;

public class Q1145 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        do {
            x = sc.nextInt();
        } while (x < 1 || x > 20);
        do {
            y = sc.nextInt();
        } while (y < x || y > 100000);

        for (int i = 1; i <= y; i++) {
            for (int c = 0; c < x - 1; c++) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println(i);
        }

    }
}
