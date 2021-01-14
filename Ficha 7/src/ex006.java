import java.util.Scanner;

public class ex006 {
    public final static int MAXVALORES = 10;
    public static void main(String[] args){
        int inteiros[] = new int[20];
        int n = 1;
    }
    public static int lerInteiro(int[] v){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Insira um número inteiro: ");
        int n = 0;
        do{

            v[n] = scan.nextInt();
            n++;

        }while (v[n -1] != 0 && n < MAXVALORES);
        if (v[n - 1] == 0){
            n--;
        }
        return n;
    }
    public static boolean crescente(int[]v, int n){
        for(int i = 1; i < n; i++){
            if(v[i] <= v[i-1]){
                return false;
            }
        }
        return true;
    }
    public static boolean alternado(int[]v, int n){
        for(int i = 1; i < n; i++){
            if(v[i] * v[i-1] >= 0){
                return false;
            }
        }
        return true;
    }
    /*public boolean semRepeticoes(int [] v, int n){
        int i, j;
        boolean semR = true;
        for(i = 0; i < n)*/
    }


