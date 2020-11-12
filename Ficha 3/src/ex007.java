public class ex007 {
    public static void main(String[] args){
        int n;
        float x;
        char ch;
        x = 100.554f;
        n = (int) x;
        ch = 'd';

        System.out.printf("O valor de x= %f\n", x); //Apenas imprimiu na tela o valor atribuído à variável "x".
        System.out.printf("O valor de n= %d\n", n); //Fez uma conversão do valor atriuído a "x", apenas imprimindo a porção inteira de "x".
        System.out.printf("O valor (char) de n= %c\n", (char)n); //Converteu a variável inteira "n" em um char da tabela ASCII correspondente a 100.
        System.out.printf("O valor de ch= %c\n", ch); //Apenas imprimiu na tela o valor atribuído à variável "ch"
        System.out.printf("O valor (int) de ch= %d\n", (int)ch); //Valor inteiro de char, corresponde a 100 na tabela ASCII
    }
}
