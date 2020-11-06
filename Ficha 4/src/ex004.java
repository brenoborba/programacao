import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o seu estado civil?\n[S] Solteiro(a)\n[C] Casado(a)\n[V] Viúvo(a)\n[D] Divorciado(a)\n");
        String estado_civil = scan.next();

        switch (estado_civil) {
            case "s":
            case "S": System.out.println("Solteiro(a)\n"); break;
            case "c":
            case "C": System.out.println("Casado(a)\n"); break;
            case "v":
            case "V": System.out.println("Viúvo(a)"); break;
            case "d":
            case "D": System.out.println("Divorciado(a)");  break;
            default: System.out.println("Estado inválido!\n");
        }
    }
}
