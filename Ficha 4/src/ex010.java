import java.util.Scanner;

public class ex010 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um carácter: ");
       char ch_default = scan.nextLine().charAt(0);

       char ch_mai = Character.toUpperCase(ch_default);
       char ch_min  = Character.toLowerCase(ch_default);

        System.out.println("O caracter digitado em sua forma maiúscula: " + ch_mai);
        System.out.println("O carácter inserido em sua forma minúscula: " + ch_min  );

    }
}
