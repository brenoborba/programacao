import java.util.Scanner;

public class ex008 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("[B]\n[G]\n[P]\n[S]");
        String input = scan.next();

        switch (input){
            case "b":
            case "B": System.out.print("BENFICA"); break;
            case "g":
            case "G": System.out.print("GUIMARAES"); break;
            case "p":
            case "P": System.out.print("PORTO"); break;
            case "s":
            case "S": System.out.print("SPORTING"); break;
            default: System.out.print("Clube sem motivos de interesse!");
        }


    }
}
