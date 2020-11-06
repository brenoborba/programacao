import java.util.Scanner;

public class ex011_a {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String A, S, D, M;

        //Escolha de operação do usuário:
        System.out.println("Escolha uma opção:\n[A] Adição\n[S] Subtração\n[D] Divisão\n[M] Multiplicação");
        char escolha_operacao = scan.next().charAt(0);

        //Leitura de valores:
        System.out.println("Introduza dois números: ");
        int escolha1 = scan.nextInt();
        int escolha2 = scan.nextInt();

        //Operadores:
        int adição = escolha1 + escolha2;
        int subtração = escolha1 - escolha2;
        int divisao = escolha1 / escolha2;
        int multiplicacao = escolha1 * escolha2;

        switch(escolha_operacao) {
            case 'a':
            case 'A': System.out.printf("A adição de %d e %d é igual à: %d", escolha1, escolha2, adição); break;
            case 's':
            case 'S': System.out.printf("A subtração de %d e %d é igual à: %d", escolha1, escolha2, subtração); break;
            case 'd':
            case 'D': System.out.printf("A divisão de %d e %d é igual à: %d", escolha1, escolha2, divisao); break;
            case 'm':
            case 'M': System.out.printf("A multiplicação de %d e %d é igual à: %d", escolha1, escolha2, multiplicacao); break;

        }


    }
}