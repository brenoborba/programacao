import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o valor da acelaração: ");
        float aceleracao = scan.nextFloat();

        System.out.print("Insira o valor do tempo: ");
        float tempo = scan.nextFloat();

        float formula_espaco_percorrido = (float) ((aceleracao * Math.pow(tempo, 2))/2);

        System.out.println("O espaço percorrido para os valor inseridos é igual à: " + formula_espaco_percorrido);

    }
}
