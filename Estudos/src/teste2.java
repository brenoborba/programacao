import java.util.Scanner;

public class teste2 {
    public static void main(String[] args){
        float alt = 0;
        int peso = 0;

        float altaux = 0;
        float pesoaux = 0;
        float imcaux = 0;

        lerPeso(peso);
        lerAltura(alt);




    }
    static void lerAltura(float n){
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira a sua altura (m): ");
        n = scan.nextFloat();

    }
    static void lerPeso(int n){
        Scanner scan = new Scanner(System.in);

        System.out.printf("Insira o seu peso (kg): ");
        n = scan.nextInt();

    }
    static void imc(int p, float a){
        float imc;
        imc = (p/(a * a));
    }

    static void classificacao(float imc){

        if(imc >= 0 && imc <= 18 )
            System.out.printf("Abaixo de Peso (IMC = %.2f)", imc);

        else if(imc > 18.5 && imc <= 24.9)
            System.out.printf("Peso normal (IMC = &.2f)", imc);

        else if(imc > 24.9 && imc >= 29.9)
            System.out.printf("Sobrepeso (IMC = %.2f)", imc);

        else if(imc > 29.9 && imc <= 34.9 )
            System.out.printf("Obesidade Grau I (IMC = %.2f)", imc);

        else if(imc > 34.9 && imc <= 39.9)
            System.out.printf("Obesidade Grau II (IMC = %.2f)", imc);

        else if(imc >= 39.9)
            System.out.printf("Obesidade Grau III ou Mórbida (IMC = %.2f)", imc);

        else
            System.out.printf("Valor de IMC inválido, tente novamente.");

    }

}
