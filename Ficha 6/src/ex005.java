import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a;
        System.out.print("Insira um número inteiro: ");
        a = scan.nextInt();

        if (par(a)){
            System.out.print("O número é par");
        }
        else
            System.out.print("O número é ímpar");

    }
    static boolean par(int n){
        return n % 2 == 0;
    }
}
