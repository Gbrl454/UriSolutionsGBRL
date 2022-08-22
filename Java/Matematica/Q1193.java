package UriSolutionsGBRL.Java.Matematica;

//  Conversão entre Bases
//    O professor de matemática de Juliano marcou uma prova cujo conteúdo será apenas conversão entre valores decimais, hexadecimais e binários. Uma das coisas mais complexas para Juliano é fazer estas conversões de base entre números. Por mais que estude, tem muita dificuldade para entender. Portanto, como você entende de computação e é amigo(a) de Juliano, ele solicitou a tua ajuda para que faça um programa que verifique se as conversões feitas por ele estão correta.
//
//        Entrada
//        A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N, indicando o número de casos de teste que virão a seguir, um por linha. Cada caso de teste contém um valor X (X > 0) seguido de um texto Y com três caracteres, indicando se o valor X está no formato binário, decimal ou hexadecimal. Independente do formato, qualquer dos números deverá caber em um inteiro de 32 bits.
//
//        Saída
//        Para cada caso de teste, você deve apresentar o número de caso de teste seguido por duas linhas, que contém a conversão do valor fornecido para as outras duas bases. A sequência das bases de saída será sempre: decimal, hexadecimal (em minúsculo) e binário, ou seja deve-se respeitar esta ordem excluindo obviamente o formato de entrada.
//
//        Obs: deverá ser impressa uma linha em branco após cada caso de teste, inclusive após o último caso de teste.

import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String ler, x, y;
        int dec;

        String[][] leitura = new String[n][2];

        for (int i = 0; i < n; i++) {
            do {
                do {
                    ler = sc.nextLine();
                } while (ler.length() < 4);

                String[] leitor = ler.split(" ");
                x = leitor[0];
                y = leitor[1];

            } while (!y.equalsIgnoreCase("dec") &&
                    !y.equalsIgnoreCase("hex") &&
                    !y.equalsIgnoreCase("bin"));

            leitura[i][0] = x;
            leitura[i][1] = y;
        }

        for (int i = 0; i < n; i++) {
            x = leitura[i][0];
            y = leitura[i][1];

            System.out.println("Case " + (i + 1) + ":");

            switch (y) {
                case "bin":
                    dec = Integer.parseInt(x, 2);
                    System.out.println(dec + " dec");
                    System.out.println(Integer.toString(dec, 16) + " hex\n");
                    break;
                case "dec":
                    dec = Integer.parseInt(x);
                    System.out.println(Integer.toString(dec, 16) + " hex");
                    System.out.println(Integer.toString(dec, 2) + " bin\n");
                    break;
                case "hex":
                    dec = Integer.parseInt(x, 16);
                    System.out.println(dec + " dec");
                    System.out.println(Integer.toString(dec, 2) + " bin\n");
                    break;
            }
        }
    }
}