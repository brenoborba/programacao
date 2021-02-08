import java.util.Scanner;

public class ex008 {
    static void trocavetor(int[] x, int[] y){
        int i;
        int[] aux = new int[x.length];

        for(i = 0; i < x.length; i++){
            aux[i] = y[i];

        }

        for(i = 0; i < x.length; i++){
            y[i] = x[i];

        }
        System.out.printf("Vetor y:\n");
        for(i = 0; i < y.length; i++){
            System.out.printf("%d\n", aux[i]);

        }
        System.out.printf("Vetor x:\n");
        for(i = 0; i < x.length; i++){
            System.out.printf("%d\n", x[i]);

        }

    }
    static void mostravetor(int[] x){
        System.out.printf("Numeros inseridos:\n");
        for(int i = 0; i < x.length; i++){
            System.out.printf("%d\n", x[i]);

        }
    }
    static void inteiros(int[] x, int n){
        n = x.length;
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < n; i++){
            System.out.printf("Insira um inteiro: ");
            x[i] = scan.nextInt();

        }
        System.out.printf("Numero de valores inseridos: %d\n", n);
    }
    public static void main(String[] args){
        int n = 5;
        int[] x = new int[n];
        int[] y = new int[n];
        inteiros(x, n);
        inteiros(y, n);
        mostravetor(x);
        trocavetor(x, y);

    }
}
