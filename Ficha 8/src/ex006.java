import java.util.Scanner;

public class ex006 {

    static int conversor(String[] str){
        return 0;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] palavras = new String[19];
        int[] numerochars = new int[19];
        int n = palavras.length;

        for (int i = 0; i < n; i++) {
            System.out.printf("Insira uma palavra: ");
            palavras[i] = scan.nextLine();

            if (palavras[i].equals(""))
                break;


        }
    }
}