import java.util.Scanner;

public class ex007 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira uma média de temperatura: ");
        float temp = scan.nextFloat();

        if (temp <= 10)
            System.out.print("Muito Frio");

        else if (temp > 10 & temp <= 20)
            System.out.print("Frio");

        else if (temp > 20 & temp <=25 )
            System.out.print("Ameno");

        else if (temp > 25 & temp <= 30)
            System.out.print("Quente");

        else if (temp > 30)
            System.out.print("Muito quente");



    }
}
