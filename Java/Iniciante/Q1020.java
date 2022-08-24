package UriSolutionsGBRL.Java.Iniciante;

//  Idade em Dias
//    Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
//    Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
//
//        Entrada
//        O arquivo de entrada contém um valor inteiro.
//
//        Saída
//        Imprima a saída conforme exemplo fornecido.

import java.util.Scanner;

public class Q1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeDias = sc.nextInt();

        final int ANO = 365, MES = 30;

        int qAnos = idadeDias / ANO;
        idadeDias -= qAnos * ANO;
        int qMeses = idadeDias / MES;
        idadeDias -= qMeses * MES;

        System.out.println(qAnos + " ano(s)");
        System.out.println(qMeses + " mes(es)");
        System.out.println(idadeDias + " dia(s)");
    }
}
