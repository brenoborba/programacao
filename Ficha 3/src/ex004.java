import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        int horas, minutos, segundos, tempo_em_segundos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza o número de horas, minutos e segundos (hh:mm:ss): ");

        sc.useDelimiter(":|\\s+");
        horas = sc.nextInt();
        minutos = sc.nextInt();
        segundos = sc.nextInt();

        tempo_em_segundos = horas * 3600 + minutos * 60 + segundos;
        System.out.println("Horas em segundos: " + tempo_em_segundos);




    }
}
