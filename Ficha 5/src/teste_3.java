import java.util.Scanner;

public class teste_3 {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o valor do ordenado mensal: ");
        float ordenado = scan.nextFloat();

        float ordenado_anual = ordenado * 14;
        float ordenado_aumentado;

        if (ordenado_anual <= 14000) {
            ordenado_aumentado = ordenado_anual * 1.2f;
            System.out.printf("O ordenado foi aumentado e agora tem o valor de %.2f euros", ordenado_aumentado);
        }
        else
            System.out.printf("O ordenado é superior a 14000 euros anuais logo não há alteração: \nO ordenado inserido é igual a: %.2f euros", ordenado_anual);



    }
}
