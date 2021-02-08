import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira um número inteiro: ");
        int a = scan.nextInt();

        if(par(a))
            System.out.printf("O número é par");
        else
            System.out.printf("o número é ímpar");

    }
    static boolean par(int n){
        return n % 2 == 0;
    }
}