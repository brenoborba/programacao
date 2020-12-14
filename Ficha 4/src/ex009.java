import java.util.Scanner;

public class ex009 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira 3 números inteiros: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        int aux;

        if (n1 == 0 || n2 == 0 || n3 == 0)
            System.out.print("Um dos valor é igual à 0!\n");
        else
            System.out.print("Nenhum dos valores inseridos é igual à 0!");

        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }
        if (n2 > n3){
            aux = n2;
            n2 = n3;
            n3 = aux;
        }
        if (n1 > n2){
            aux = n1;
            n1 = n2;
            n2 = aux;

        }
        System.out.printf("%d %d %d\n", n1, n2, n3);
    }
}
