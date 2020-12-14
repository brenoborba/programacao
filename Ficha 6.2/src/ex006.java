import java.util.Scanner;

public class ex006 {
    static double potencia(double x, int n){
        double pot;
        int k;
        for(pot = 1, k = 1; k <= Math.abs(n); k++){
            pot *= x;
        }
        if (n >= 0)
            return pot;
        else
            return 1/pot;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int expoente;
        double base;

        System.out.print("Insira a base: ");
        base = sc.nextDouble();

        System.out.printf("Insira o valor do expoente: ");
        expoente = sc.nextInt();

        System.out.printf("%.2f^%d = %.2f", base, expoente, potencia(base, expoente));

    }
}
