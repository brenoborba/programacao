import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        int n = 1;
        int notas[] = new int[n];
        lerNotas(n);

    }
    public static int lerNotas (int n){

        Scanner scan = new Scanner(System.in);
        do{
            System.out.printf("Insira uma nota: ");
            n = scan.nextInt();

        }while(n >= 0);
        return n;
    }

}
