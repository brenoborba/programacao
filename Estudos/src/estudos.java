import java.util.Scanner;

public class estudos {
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);

        float valor;
        float menor = 0;
        float maior = 0;
        float contador = 0;

        do{
            System.out.print("Insira um número real: ");
            valor = sc.nextFloat();

            if (valor < 0)
                break;

            if (contador == 0)
                menor = valor;
            else if (menor > valor)
                menor = valor;

            if (maior < valor)
                maior = valor;

            contador += 1;




        }while(valor >= 0);

        System.out.printf("menor é %.2f, maior %.2f", menor, maior); */
        float valor, menor, maior;
        Scanner sc = new Scanner(System.in);
        valor = 1;
        menor = 0;
        maior = 0;
        int contador = 0;

        while(valor > 0){
            System.out.printf("Insira um número real: ");
            valor = sc.nextFloat();

            if (contador == 0)
                menor = valor;
            else if (menor > valor)



            contador += 1;
        }
        System.out.printf("%.1f", valor);
    }
}
