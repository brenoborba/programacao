import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int n1 = scan.nextInt();

        System.out.print("Insira mais um número inteiro: ");
        int n2 = scan.nextInt();

        int n12 = ++n1;

        int n22 = ++n2;

        System.out.println("Valor da primeira varíavel pós alteração: " + n12);
        System.out.println("Valor da segunda variável pós alteração: " + n22);

    }
}
