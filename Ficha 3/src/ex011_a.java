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
            case 'A': System.out.print("A adição de " + escolha1 + " " + escolha2 + " é igual à: " + adição); break;
            case 's':
            case 'S': System.out.print("A subtração de " + escolha1 + " " + escolha2 + " é igual à: " + subtração); break;
            case 'd':
            case 'D': System.out.print("A divisão de " + escolha1 + " " + escolha2 + " é igual à: " + divisao); break;
            case 'm':
            case 'M': System.out.print("A multiplicação de " + escolha1 + " " + escolha2 + " é igual à: " + multiplicacao); break;
            default: System.out.println("Opção inválida, tente novamente!");

        }


    }
}