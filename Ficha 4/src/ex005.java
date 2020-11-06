import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = scan.nextInt();

        if (numero >= 10 & numero <= 50)
            System.out.print("O número inserido ESTÁ entre 10 e 50!\n");

        else
            System.out.println("O número inserido NÃO está entre 10 e 50!");


    }
}
