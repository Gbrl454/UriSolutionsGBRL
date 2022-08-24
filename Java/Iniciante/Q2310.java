package UriSolutionsGBRL.Java.Iniciante;

//  Voleibol
//    Um treinador de voleibol gostaria de manter estatísticas sobre sua equipe. A cada jogo, seu auxiliar anota quantas tentativas de saques, bloqueios e ataques cada um de seus jogadores fez, bem como quantos desses saques, bloqueios e ataques tiveram sucesso (resultaram em pontos). Seu programa deve mostrar qual o percentual de saques, bloqueios e ataques do time todo tiveram sucesso.
//
//        Entrada
//        A entrada é dada pelo número de jogadores N (1 ≤ N ≤ 100), seguido pelo nome de cada um dos jogadores. Abaixo do nome de cada jogador, seguem duas linhas com três inteiros cada. Na primeira linha S, B e A (0 ≤ S,B,A ≤ 10000) representam a quantidade de tentativas de saques, bloqueios e ataques e na segunda linha, S1, B1 e A1 (0 ≤ S1 ≤ S; 0 ≤ B1 ≤ B; 0 ≤ A1 ≤ A) com o número de saques, bloqueios e ataques deste jogador que tiveram sucesso.
//
//        Saída
//        A saída deve conter o percentual total de saques, bloqueios e ataques do time todo que resultaram em pontos, conforme mostrado no exemplo.

import java.util.Scanner;

public class Q2310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            n = sc.nextInt();
        } while (n < 1 || n > 100);

        Jogador[] jgs = new Jogador[n];

        for (int i = 0; i < n; i++) {
            int s, b, a, s1, b1, a1;

            String nome = sc.next();

            do {
                s = sc.nextInt();
            } while (s < 0 || s > 10000);
            do {
                b = sc.nextInt();
            } while (b < 0 || b > 10000);
            do {
                a = sc.nextInt();
            } while (a < 0 || a > 10000);

            do {
                s1 = sc.nextInt();
            } while (s1 < 0 || s1 > s);
            do {
                b1 = sc.nextInt();
            } while (b1 < 0 || b1 > b);
            do {
                a1 = sc.nextInt();
            } while (a1 < 0 || a1 > a);

            Jogador jg = new Jogador(nome, s, b, a, s1, b1, a1);
            jgs[i] = jg;
        }

        Jogo jogo = new Jogo(jgs);
    }
}

class Jogador {
    private String nome;
    private int tSaqu, tBloq, tAtaq, saqu, bloq, ataq;

    public Jogador(String nome, int tSaqu, int tBloq, int tAtaq, int saqu, int bloq, int ataq) {
        this.nome = nome;
        this.tSaqu = tSaqu;
        this.tBloq = tBloq;
        this.tAtaq = tAtaq;
        this.saqu = saqu;
        this.bloq = bloq;
        this.ataq = ataq;
    }

    public int gettSaqu() {
        return tSaqu;
    }

    public int gettBloq() {
        return tBloq;
    }

    public int gettAtaq() {
        return tAtaq;
    }

    public int getSaqu() {
        return saqu;
    }

    public int getBloq() {
        return bloq;
    }

    public int getAtaq() {
        return ataq;
    }
}

class Jogo {
    private Jogador[] jogadores;

    private int tS = 0, tB = 0, tA = 0, sA = 0, bA = 0, aA = 0;

    private double pS, pB, pA;

    public Jogo(Jogador[] jogadores) {
        this.jogadores = jogadores;
        calcular();
        mensagem();
    }

    public void calcular() {
        for (Jogador jg : jogadores) {
            tS += jg.gettSaqu();
            tB += jg.gettBloq();
            tA += jg.gettAtaq();
            sA += jg.getSaqu();
            bA += jg.getBloq();
            aA += jg.getAtaq();
        }
        pS = ((double) sA / tS) * 100;
        pB = ((double) bA / tB) * 100;
        pA = ((double) aA / tA) * 100;
    }

    public void mensagem() {
        System.out.println("Pontos de Saque: " + String.format("%.2f", pS) + " %.");
        System.out.println("Pontos de Bloqueio: " + String.format("%.2f", pB) + " %.");
        System.out.println("Pontos de Ataque: " + String.format("%.2f", pA) + " %.");
    }
}