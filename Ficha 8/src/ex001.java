import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Insira uma string: ");
        String str = scan.nextLine();

        String troca = str.replace(" ", "\n");
        System.out.printf(troca);
    }
}
