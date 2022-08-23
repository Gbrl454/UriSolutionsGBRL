package UriSolutionsGBRL.Java.Iniciante;

//  Conversão de Tempo
//    Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
//
//        Entrada
//        O arquivo de entrada contém um valor inteiro N.
//
//        Saída
//        Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

import java.util.Scanner;

public class Q1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = n/60;
        n -= m*60;

        int h = m/60;
        m -= h*60;

        System.out.println(h+":"+m+":"+n);
    }
}





// REVISAR