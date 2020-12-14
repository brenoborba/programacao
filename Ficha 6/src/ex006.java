import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("x = ");
        double base = scan.nextDouble();

        System.out.println("n = ");
        int exp = scan.nextInt();

        System.out.printf("%.2f^%d = %.2f\n", base, exp, potencia(base, exp));
    }
    static double potencia(double x, int n) {
        double pot;
        int k;
        for (pot = 1, k = 1; k <= Math.abs(n); k++) {
            pot *= x;
        }
        if (n >= 0) {
            return pot;
        }
        else{
            return 1/pot;
        }
    }
}
