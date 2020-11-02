import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma letra maiúscula: ");
        char ch;
        ch = sc.nextLine().toLowerCase().charAt(0);
        System.out.printf("Minúscula correspondente: %c\n", ch);
    }
}
