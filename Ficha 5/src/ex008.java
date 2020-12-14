import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int linhas, ramos, colunas;
        char letra = 'A';

        System.out.println("Número de ramos: ");
        ramos = scan.nextInt();

        for (linhas = 1; linhas <= ramos; linhas++) {
            for (colunas = 1; colunas <= linhas; colunas++)
                System.out.printf("%c ", letra);

            System.out.print("\n");
            letra++;

            if (letra > 'z') {
                letra = 'A';
            }
        }
    }
}