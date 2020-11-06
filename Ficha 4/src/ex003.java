import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int numero = scan.nextInt();

        if (numero > 0)
            System.out.print("O número inserido é positivo");
        else
            System.out.print("O número inserido é negativo");

    }
}
