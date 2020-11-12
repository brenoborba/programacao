import java.util.Scanner;
public class ex012 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduza dois valores: ");
        int valor_usuario1 = scan.nextInt();
        int valor_usuario2 = scan.nextInt();

        int divisao_inteira = valor_usuario1 / valor_usuario2;
        float divisao_real = (float)valor_usuario1 / valor_usuario2;
        int resto_divisao = valor_usuario1 % valor_usuario2;
        double raiz_quadrada = Math.sqrt((valor_usuario1 + valor_usuario2));

        System.out.printf("A divisão inteira é: %d\n", divisao_inteira);
        System.out.printf("A divisão real é: %.2f\n", divisao_real);
        System.out.printf("O resto da divisão é: %d\n", resto_divisao);
        System.out.printf("A raiz quadrada da soma dos dois valores é: %.2f\n", raiz_quadrada);
        System.out.printf("O primeiro valor incrementado é: %d\n", ++valor_usuario1);
        System.out.printf("O segundo valor decrementado é: %d\n", --valor_usuario2);

    }
}
