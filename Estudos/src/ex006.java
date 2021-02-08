import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira uma base x: ");
        double base = scan.nextInt();

        System.out.printf("Insira um expoente n: ");
        int expoente = scan.nextInt();

        System.out.printf("%.2f^%d = %.2f\n", base, expoente,potencia(base,expoente));
    }
    static double potencia(double x, int n){
        double pot;
        int k;
        for(pot = 1, k = 1; k <= n; k++)
            pot *= x;
        return pot;
    }
}
