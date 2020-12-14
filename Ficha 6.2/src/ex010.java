import java.util.Date;
import java.util.Scanner;

public class ex010 {
    static boolean ano_bissexto(int ano){
        return ano % 4 == 0;
    }

    static void ultimo_dia(){
        int mes;
        int ano;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o ano: ");
        ano = sc.nextInt();

        System.out.print("Insira o mes: ");
        mes = sc.nextInt();

        if (mes <= 7 && mes % 2 != 0){
            System.out.print("Útilmo dia: 31");
        }
        else if(mes <= 7 && mes % 2 == 0){
            if (mes == 2 && ano_bissexto(ano)) {        //Se o ano é bissexto e é fevereiro
                System.out.print("Último dia 29");
            }
            else if(mes == 2 && !ano_bissexto(ano)) {   //Se o ano não é bissexto e é fevereiro
                System.out.print("Último dia 28");
            } else{
                System.out.print("Ultimo dia: 30");
            }

        }
        else if(mes > 7 && mes % 2 == 0){
            System.out.print("Último dia 31");
        }
        else
            System.out.print("Ultimo dia 30");
    }

}
