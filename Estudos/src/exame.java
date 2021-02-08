import java.util.Scanner;

public class exame {
    static boolean ePrimo(int n){
        for(int i = 2; i < n; i++){
            if(n % 2 == 0){
                System.out.printf("%d nao é primo!\n", n);
                return false;
            }

        }
        System.out.printf("%d é primo!\n", n);
        return true;


    }
    static void ePar(int x){
        if(x % 2 == 0){
            System.out.printf("%d é um numero par!\n", x);
        }
        else
            System.out.printf("%d é um numero impar!\n", x);
    }
    static void lerValores(int[] x){
        Scanner scan = new Scanner(System.in);
        int n = 1;
        for(int i = 0; i < x.length; i++){
            System.out.printf("Insira o %dº numero: \n", n);
            x[i] = scan.nextInt();
            n++;
        }
    }
    public static void main(String[] args){
        int[] inteiros = new int[5];
        int numero = 4;
        int soma = 0;

        lerValores(inteiros);

        for(int i = 0; i < inteiros.length; i++){
            ePar(inteiros[i]);

        }
        for(int i = 0; i < inteiros.length; i++){
            ePrimo(inteiros[i]);
        }

        for(int i = 0; i < inteiros.length; i++){
            soma += inteiros[i];
        }
    }
}
