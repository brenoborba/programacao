import java.util.Scanner;

public class ex003 {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        float valor;
        float menor = 0;
        float maior = 0;
        float quant = 0;


        do{
            System.out.println("Insira um número real: ");
            valor = scan.nextFloat();
            quant += 1;

                if (quant == 0)
                    maior = menor = valor;
                else if (valor > maior)
                    maior = valor;

                if (valor <= menor)
                    menor = valor;

        }while(valor >= 0);

        System.out.printf("O menor valor inserido é %.0f e o maior valor inserido é %.0f", menor, maior);
    }
}
