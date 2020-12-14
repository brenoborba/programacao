import java.util.Scanner;

public class ex004 {
    static int soma(int a, int b){
        int c;
        c = a + b;
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Insira o primeiro valor: ");
        n1 = sc.nextInt();

        System.out.print("Insira o segundo valor: ");
        n2 = sc.nextInt();

        System.out.printf("%d + %d = %d", n1, n2, soma(n1, n2));

    }
}
