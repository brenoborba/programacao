import java.util.Scanner;

public class ex012 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduza dois valores: ");
        int valor_usuario1 = scan.nextInt();
        int valor_usuario2 = scan.nextInt();

        int divisao_inteira = valor_usuario1 / valor_usuario2;
        float divisao_real = valor_usuario1 / valor_usuario2;
        int resto_divisao = valor_usuario1 % valor_usuario2;
        double raiz_quadrada = Math.pow((valor_usuario1 + valor_usuario2), 2);


        System.out.println("A divisão inteira é: " + divisao_inteira);
        System.out.println("A divisão real é: " + divisao_real);
        System.out.println("O resto da divisão é: " + resto_divisao);
        System.out.println("A raiz quadrada da soma dos dois valores é: " + raiz_quadrada);
        System.out.println("O primeiro valor incrementado é: " + ++valor_usuario1);
        System.out.println("O segundo valor decrementado é: " + --valor_usuario2);


    }
}
