import java.util.Scanner;

public class ex005 {
    static boolean par(int a){
        return a % 2 == 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.printf("Insira um número: ");
        n1 = sc.nextInt();

        System.out.printf("O número inserido é par? %b", par(n1));
    }
}
