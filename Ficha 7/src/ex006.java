import java.util.Scanner;

public class ex006 {
    static void lerValor(int[] x){
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < x.length; i++) {
            System.out.printf("Insira um numero: ");
            x[i] = scan.nextInt();

            if(x[i] == 0 || i == 21)
                break;
        }
    }
    static boolean crescente(int[] x){
        int n = 1;
        for(int i = 0; i < x.length; i++)
            if(!(x[i] < x[i + 1] && x[i] == x[i + 1] - n))
                return false;
            else
                return true;

        return true;
    }
    static boolean alternada(int[] x){
        for(int i = 0; i < x.length; i++)
            if(x[i] > 0 && x[i + 1] < 0)
                return true;
            else
                return false;

        return false;
    }
    static boolean semrepeticao(int[] x){
        int n;
        for(int i = 0; i < x.length - 1; i++)
            if(x[i] != x[i + 1]){
                return true;
            }
        else
            return false;
        return false;

    }


    public static void main(String[] args){
        int[] x = new int[5];
        lerValor(x);
        System.out.printf("%b", semrepeticao(x));

    }

}


