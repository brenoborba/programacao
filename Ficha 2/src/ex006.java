import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva 3 valores: ");

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        float media = (n1 + n2 + 3)/3;

        System.out.println("Os desvios dos números inseridos é igual à:");
        System.out.println("n1 = " + (n1 - media));
        System.out.println("n2 = " + (n2 - media));
        System.out.println("n3 = " + (n3 - media));

    }
}
