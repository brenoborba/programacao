import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número de horas: ");
        int horas = scan.nextInt();

        System.out.println("Insira um número de minutos: ");
        int minutos = scan.nextInt();

        System.out.println("Insira um número de segundos: ");
        int segundos = scan.nextInt();

        System.out.print("O número de segundos presente nos valores inseridos é igual à: ");
        System.out.print(+ (horas * 3600 + minutos * 60 + segundos) + " segundos");

    }
}

