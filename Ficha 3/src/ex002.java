import java.util.Scanner;

public class ex002 {
    public static final double PI = 3.14159265358979323846; //Variável estática

    public static void main(String[] args){

        double raio, perimetro, area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza o raio da circunferência: ");
        raio = sc.nextFloat();

        area = PI * raio * raio;
        perimetro = 2 * PI * raio;

        System.out.printf("Area = %f\nPerimetro = %f\n", area, perimetro);


    }
}
