package UriSolutionsGBRL.Java.AdHoc;

//  Sequência
//    O professor da importante disciplina de Indução Matemática está tentando resolver uma versão generalizada de um problema muito tradicional: encontrar o valor máximo possível para a soma dos elementos de uma subsequência contígua de uma sequência de números inteiros quaisquer. Mais rigorosamente, dado uma sequência S = [s1, s2, . . . , sN ], onde si é um número inteiro qualquer, para 1 ≤ i ≤ N, maximizar soma(i, j) = si + si+1 + · · · + sj entre todos os possíveis pares (i, j), onde 1 ≤ i ≤ j ≤ N.
//
//    Na versão do professor, entretanto, alguns elementos da sequência são especiais e estão marcados. Além da sequência marcada, são dadas como entrada duas cotas: L e H, com L ≤ H. O objetivo agora é encontrar o valor máximo possível para a soma dos elementos de uma subsequência contígua, que contenha pelo menos L e no máximo H elementos marcados. 
//
//    Por definição, uma subsequência vazia (de zero elementos) tem soma igual a zero. Mas note que, como podemos ter uma cota inferior para o número de elementos marcados, a subsequência contígua de soma máxima pode ter soma negativa!
//
//        Entrada
//        A primeira linha da entrada contém três inteiros N (1 ≤ N ≤ 105), L e H (0 ≤ L ≤ H ≤ 20), indicando respectivamente o número de elementos na sequência, a cota inferior L e a cota superior H. A segunda linha contém N inteiros si (−103 ≤ si ≤ 103 , para 1 ≤ i ≤ N), para 1 ≤ i ≤ N, definindo os elementos da sequência. A terceira linha contém N inteiros mi , para 1 ≤ i ≤ N, indicando as marcas. Se o i-ésimo elemento está marcado, o valor é mi = 1. Se não estiver marcado, mi = 0. O número de elementos  marcados na sequência é maior ou igual a L; portanto sempre existe solução.
//
//        Saída
//        Imprima um inteiro, representando o valor máximo possível para a soma dos elementos de uma subsequência contígua, que contenha pelo menos L e no máximo H elementos marcados.

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2837 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ent = sc.nextLine();

        // entrada de valores
        StringTokenizer stk = new StringTokenizer(ent, " ");
        int n = Integer.parseInt(stk.nextToken());
        int l = Integer.parseInt(stk.nextToken());
        int h = Integer.parseInt(stk.nextToken());

        int[] s = new int[n], m = new int[n];

        int i, j, k;

        // armazenamento nos arrays
        ent = sc.nextLine();
        stk = new StringTokenizer(ent, " ");
        for (i = 0; i < n; i++)
            s[i] = Integer.parseInt(stk.nextToken());

        ent = sc.nextLine();
        stk = new StringTokenizer(ent, " ");
        for (i = 0; i < n; i++)
            m[i] = Integer.parseInt(stk.nextToken());

        // set valores maximos e minimos recebidos
        final int MIN = Integer.MIN_VALUE;
        final int MAX = 20;

        // array de subsequencia
        int[][] subCon = new int[n][MAX + 1];

        // incrementação da subsquencia com o valor minimo
        for (i = 0; i < n; i++)
            for (j = 0; j < (MAX + 1); j++)
                subCon[i][j] = MIN;

        int result = MIN;

        if (m[0] == 1) { // marcado
            subCon[0][0] = 0;
            subCon[0][1] = s[0];
        } else { // não marcado
            subCon[0][0] = Math.max(0, s[0]);// pega o maior valor
        }

        for (i = 1; i < n; i++) {
            for (k = 0; k <= h; k++) {
                if (m[i] == 1) { // marcado
                    if (k == 0)
                        subCon[i][0] = 0;
                    if (k > 0 && subCon[i - 1][k - 1] > MIN)
                        subCon[i][k] = subCon[i - 1][k - 1] + s[i];
                } else { // não marcado
                    if (k == 0)
                        subCon[i][0] = Math.max(0, subCon[i - 1][0] + s[i]);
                    if (k > 0 && subCon[i - 1][k] > MIN)
                        subCon[i][k] = subCon[i - 1][k] + s[i];
                }
            }

            // maximo global
            for (k = l; k <= h; k++)
                if (subCon[i][k] > MIN)
                    result = Math.max(result, subCon[i][k]);
        }

        System.out.println(result);
    }
}
