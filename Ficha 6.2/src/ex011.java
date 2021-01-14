import java.util.Scanner;

public class ex011 {
    static int qualitativa(){
        int seletor;

        System.out.println("Escolha uma das opções abaixo:\n[1] Mau");
        System.out.println("[2] Não satisfaz");
        System.out.println("[3] Satisfaz");
        System.out.println("[4] Satisfaz bastante");
        System.out.println("[5] Execelente");


        Scanner sc = new Scanner(System.in);
        seletor = sc.nextInt();

        switch (seletor){
            case 1: System.out.print("mau"); break;
            case 2: System.out.print("Não satisfaz"); break;
            case 3: System.out.print("Satisfaz"); break;
            case 4: System.out.print("Satisfaz bastante"); break;
            case 5: System.out.print("Execelente"); break;
            default: System.out.print("Opção inválida, tente novamente!");


        }
        return seletor;

    }
    static void quantitativa(){
        if (qualitativa() >= 0 && qualitativa() <= 4)
            System.out.print("Mau");
        if (qualitativa() >= 5 && qualitativa() <= 11)
            System.out.print("Não satisfaz");
        if (qualitativa() >= 12 && qualitativa() <= 16)
            System.out.print("Satisfaz");
        if (qualitativa() >= 17 && qualitativa() <= 19)
            System.out.print("Satisfaz bastante");
        if (qualitativa() > 19 && qualitativa() <= 20)
            System.out.print("Excelente");
        else
            System.out.print("Valor inválido!");

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.print("Insira a segunda nota: ");
        int nota2 = sc.nextInt();

        System.out.print("Insira a terceira nota: ");
        int nota3 = sc.nextInt();

        System.out.print("Insira a quarta nota: ");
        int nota4 = sc.nextInt();

        System.out.print("Insira a quinta nota: ");
        int nota5 = sc.nextInt();

        System.out.print("Insira a sexta nota: ");
        int nota6 = sc.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6)/6;

        System.out.printf("A média do aluno é %d\n", media);
        System.out.printf("A média do aluno na avaliação qualitativa é %f", qualitativa());


    }

}
