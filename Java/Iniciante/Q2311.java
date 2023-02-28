package UriSolutionsGBRL.Java.Iniciante;

//  Em uma determinada competição de saltos ornamentais, cada salto recebe um grau de dificuldade e é avaliado por sete juízes. Após cada salto, os juízes, que não se comunicam uns com os outros, mostram suas notas. Um salto é cotado entre zero e dez pontos. Depois de apresentadas as notas, a mais alta e a mais baixa são descartadas. O restante é somado e multiplicado pelo grau de dificuldade do salto, que gira entre 1,2 e 3,8, definido sempre antes do início da apresentação do atleta. O julgamento então é feito da seguinte forma: supondo que um saltador tenha sua nota de partida (seu grau de dificuldade de movimento) avaliada em 2,0 e tire notas 6,0, 5,0, 5,0, 5,0, 5,0, 5,0, 4,0 em sua execução. Disso, retira-se a nota mais baixa e a mais alta, o que gera um resultado parcial de 25,0. Então, pega-se a nota de execução e multiplica-a pela nota de partida para se chegar ao resultado final, que neste exemplo é de 50,0. Seu programa deve apresentar o resultado de uma competição de acordo com estas regras.
//
//        Entrada
//        A primeira linha de entrada contém o número de competidoresN (0 ≤ N ≤ 100). A seguir são mostrados os nomes de cada um dos competidores seguidos pelo grau de dificuldade dos seus saltos GD (1.2 ≤ GD ≤ 3.8) e, a seguir, na linha seguinte, as 7 notas recebidas N1 a N7 (0 ≤ N1 a N7 ≤ 10).
//
//        Saída
//        A saída deve apresentar o resultado da competição, com o nome dos competidores seguido de seu resultado, na ordem em que os dados foram lidos.

import java.util.Scanner;

public class Q2311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Competicao(sc.nextInt(), sc);
    }
}

class Competicao {

    public Competicao(int n, Scanner sc) {

        for (int i = 0; i < n; i++) {

            Competidor competidor = new Competidor(sc.next());

            double grau;
            do {
                grau = sc.nextDouble();
            } while (grau < 1.2 || grau > 3.8);
            competidor.setGrau(grau);

            double[] notasCompetidor = new double[7];
            for (int j = 0; j < notasCompetidor.length; j++) {
                do {
                    notasCompetidor[j] = sc.nextDouble();
                } while (notasCompetidor[j] < 0 || notasCompetidor[j] > 10);
            }

            competidor.setNotas(notasCompetidor);
            System.out.println(competidor);
        }

    }
}

class Competidor {
    private final String nome;
    CalcularNota calcNota;
    private double grau;

    public Competidor(String nome) {
        this.nome = nome;
    }

    public void setGrau(double grau) {
        this.grau = grau;
    }

    public void setNotas(double[] notas) {
        calcNota = new CalcularNota(notas);
    }

    @Override
    public String toString() {
        return nome + " " + String.format("%.2f", (calcNota.getNota() * grau));
    }
}

class CalcularNota {
    double nota = 0;
    double[] notas;

    public CalcularNota(double[] notas) {
        this.notas = notas;
    }

    public double getNota() {
        for (double v : notas) {
            nota += v;
        }
        nota -= (max(notas) + min(notas));
        return nota;
    }

    private double max(double[] valores) {
        double max = 0;
        for (double valore : valores) {
            if (valore > max) {
                max = valore;
            }
        }
        return max;
    }

    private double min(double[] valores) {
        double min = valores[0];
        for (double valore : valores) {
            if (valore < min) {
                min = valore;
            }
        }
        return min;
    }
}
