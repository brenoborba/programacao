import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira a nota do aluno: ");
        float nota_aluno = scan.nextFloat();

        if (nota_aluno >= 9.5)
            System.out.println("APROVADO\n");

        else
            System.out.print("REPROVADO!");

    }
}
