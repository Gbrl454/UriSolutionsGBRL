package UriSolutionsGBRL.Java.Iniciante;

//  Entrada e Saída de String
//    O seu professor gostaria de fazer um programa com as seguintes características:
//    Crie 3 variáveis para armazenar uma frase de no máximo 100 caracteres;
//    Leia uma frase para a primeira variável;
//    Leia uma frase para a segunda variável;
//    Leia uma frase para a terceira variável;
//    Imprima a primeira variável lida no passo 2, a segunda variável lida no passo 3, a terceira variável lida no passo 4. Não esqueça de pular linha;
//    Imprima a primeira variável lida no passo 3, a segunda variável lida no passo 4, a terceira variável lida no passo 2. Não esqueça de pular linha;
//    Imprima a primeira variável lida no passo 4, a segunda variável lida no passo 2, a terceira variável lida no passo 3. Não esqueça de pular linha;
//    Repita o procedimento 5, imprimindo só 10 caracteres de cada variável.
//
//        Entrada
//        A entrada consiste vários arquivos de teste. Em cada arquivo de teste tem três linhas. Na primeira linha tem uma variável A que armazena uma frase de no máximo 100 caracteres. Na segunda linha tem uma variável B que armazena uma frase de no máximo 100 caracteres. Na terceira linha tem uma variável C que armazena uma frase de no máximo 100 caracteres. Conforme mostrado no exemplo de entrada a seguir.
//
//        Saída
//        Para cada arquivo da entrada, terá um arquivo de saída. O arquivo de saída tem quatro linhas da forma descrita nos itens 5, 6, 7 e 8. Conforme mostra o exemplo de saída a seguir.

import java.util.Scanner;

public class Q2760 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String v2 = sc.nextLine();
        String v3 = sc.nextLine();
        String v4 = sc.nextLine();

        System.out.println(v2 + v3 + v4);
        System.out.println(v3 + v4 + v2);
        System.out.println(v4 + v2 + v3);
        System.out.printf("%.10s%.10s%.10s%n", v2, v3, v4);
    }
}
