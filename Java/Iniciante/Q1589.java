package UriSolutionsGBRL.Java.Iniciante;

//Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2. Você precisa comprar um conduite circular (veja a imagem abaixo que ilustra um conduite) de maneira a passar os dois cabos por dentro dele:
//
//        Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos, qual o raio do menor círculo que possa englobar ambos os dois?
//
//        Entrada
//        Na primeira linha teremos um inteiro T (T ≤ 10000), indicando o número de casos de teste.
//
//        Na única linha de cada caso teremos dois números inteiros R1 e R2, indicando os respectivos raios. Os inteiros serão positivos e todas as contas caberão em um inteiro normal de 32 bits.
//        Saída
//        Em cada caso, imprima o menor raio possível em uma única linha

import java.util.Scanner;

public class Q1589 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        new Teste(sc.nextInt(), sc);
    }
}

class Teste {
    Scanner sc;

    public Teste (int casos, Scanner sc) {
        this.sc = sc;

        for (int i = 0; i < casos; i++) {
            new Concuite(sc.nextInt(), sc.nextInt());
        }
    }
}

class Cabo {
    int raio;

    public Cabo (int raio) {
        this.raio = raio;
    }

    public int getRaio () {
        return raio;
    }
}

class Concuite {
    Cabo cabo1, cabo2;

    public Concuite (int raioCabo1, int raioCabo2) {
        cabo1 = new Cabo(raioCabo1);
        cabo2 = new Cabo(raioCabo2);
        System.out.println(cabo1.getRaio() + cabo2.getRaio());
    }
}
