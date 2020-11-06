import java.util.Scanner;

public class ex001 {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o seu salário? ");
        float salario = scan.nextFloat();

        if (salario <= 600)
            salario += 100;

        System.out.printf("Salário final: %.2f euros\n", salario);

    }
}
