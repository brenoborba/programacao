import java.util.Scanner;

public class ex009 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira 3 números inteiros: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        int aux = n1;

        if (n1 == 0)
            System.out.print("O primeiro valor é igual à 0!\n");
        if (n2 == 0)
            System.out.print("O segundo valor é igual à 0!\n");
        if (n3 == 0)
            System.out.print("O tereceiro valor é igual à 0!\n");
        else
            System.out.print("Nenhum dos valores inseridos é igual à 0!");

        System.out.print("");



    }
}
