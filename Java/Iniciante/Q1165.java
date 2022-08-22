package UriSolutionsGBRL.Java.Iniciante;

//  Número Primo
//    Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7.
//
//        Entrada
//        A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 < X ≤ 107), que pode ser ou não, um número primo.
//
//        Saída
//        Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao eh primo”, de acordo com a especificação fornecida.

import java.util.Scanner;

public class Q1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            n = sc.nextInt();
        } while (n < 1 || n > 100);

        for (int i = 0; i < n; i++) {
            int x;
            do {
                x = sc.nextInt();
            } while (x <= 1 || x > Math.pow(10, 7));

            boolean primo = true;

            for (int j = 2; j < x; j++) {
                if (x % j == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }
        }
    }
}