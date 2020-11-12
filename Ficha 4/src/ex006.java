import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        //classificação = (nota exame fina * 40)/100 + (nota média de 3 fichas * 60)/100
        //if nota média > 7
        //else (nota exame final * 60)/100

        Scanner scan = new Scanner(System.in);
        //Leitura das notas
        System.out.print("Insira as notas dos exames intercalares: ");
        int exame_int_1 = scan.nextInt();
        int exame_int_2 = scan.nextInt();
        int exame_int_3 = scan.nextInt();

        System.out.print("Insira a nota do exame final: ");
        int exame_final = scan.nextInt();

        //Calculadoras
        float media_intercalar = (exame_int_1 + exame_int_2 + exame_int_3)/3;
        float classificacao = ((exame_final * 40)/100 + (media_intercalar * 60)/100);
        float classificacao_60 = exame_final * 60/100;

        //Condições de cálculo de notas
        if (media_intercalar >= 7)
            System.out.printf("A classificação final do aluno foi: %.0f", classificacao);

        else
            System.out.printf("A classificação final do foi: %.0f", classificacao_60);

    }
}
