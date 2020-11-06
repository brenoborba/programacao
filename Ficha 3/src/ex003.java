import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número de segundos: ");
        int segundos = sc.nextInt();

        int minutos = segundos / 60;
        int horas = segundos / 3600;

        System.out.println("Valor em segundos: " + segundos);
        System.out.println("Valor em minutos: " + minutos);
        System.out.println("Valor em horas: " + horas);
        System.out.printf("%d:%d:%d", horas % minutos, minutos / 60, segundos % segundos);
    }
}
