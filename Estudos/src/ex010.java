import java.util.Scanner;

public class ex010 {
    public static void main(String[] args){
        int[] v = new int[3];
        v[0] = 1;
        v[1] = 2;
        v[2] = 3;

    }
    public static void Lervetor(float[] v){
        int n, i;
        Scanner scan = new Scanner(System.in);
        n = v.length;
        for(i = 0; i <= n - 1; i++){
            int pos = i + 1;
            System.out.println("Escreva o valor do "+pos+"º elemento: ");
            v[i] = scan.nextFloat();
        }

    }

}
