import java.util.Scanner;

public class ex007 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o custo de fabrico: ");
        float custo_fabrico = scan.nextFloat();

        System.out.print("Insira a margem do vendedor: ");
        float margem_vendedor = scan.nextFloat();

        System.out.print("Insira o valor do imposto: ");
        float imposto = scan.nextFloat();

        float imposto_fixo = ((margem_vendedor + custo_fabrico) * 23)/100;

        System.out.println("O preço final do produto é igual à: " + (imposto + custo_fabrico + margem_vendedor));
        System.out.println("O preço final do produto com imposto de 23% é igual à: " + (imposto_fixo + margem_vendedor + custo_fabrico));

    }
}
