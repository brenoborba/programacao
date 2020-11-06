import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int n1 = scan.nextInt();

        System.out.print("Insira mais um número inteiro: ");
        int n2 = scan.nextInt();

        int aux = n1;
        n1 = n2;
        n2 = aux;

        System.out.printf("Valor da primeira varíavel pós alteração: %d\n", n1 );
        System.out.printf("Valor da segunda variável pós alteração: %d\n", n2);

    }
}
