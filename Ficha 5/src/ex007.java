import java.util.Scanner;

public class ex007 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int linha, ramos, coluna;

        System.out.println("N de ramos?: ");
        ramos = scan.nextInt();

        for(linha = 1; linha <= ramos; linha++){
            for(coluna = 1; coluna <= linha; coluna++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
