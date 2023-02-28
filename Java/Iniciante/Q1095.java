package UriSolutionsGBRL.Java.Iniciante;

//  Sequencia IJ 1
//    Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
//
//        Entrada
//        Não há nenhuma entrada neste problema.
//
//        Saída
//        Imprima a sequencia conforme exemplo abaixo

public class Q1095 {
    public static void main (String[] args) {
        int i = -2, j = 65;

        while (j > 0) {
            i += 3;
            j -= 5;
            System.out.println("I=" + i + " J=" + j);
        }
    }
}
