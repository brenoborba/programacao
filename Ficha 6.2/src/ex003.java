import java.util.Scanner;

public class ex003 {
    static double potencia(double x, int n){
        double pot;
        int k;
        for(pot = 1, k = 1; k <= n; k++)
            pot *= x;
        return pot;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double base;
        int exp;
        System.out.print("x = ");
        base = sc.nextDouble();

        System.out.print("n = ");
        exp = sc.nextInt();

        System.out.printf("%.2f^%d = %.2f\n", base, exp, potencia(base, exp));

    }
}
