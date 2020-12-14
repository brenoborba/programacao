public class ex001 {
    static void asteriscos (){
        int i;
        for(i = 1; i <= 20; i++){
            System.out.printf("*");
        }
        System.out.printf("\n");
    }
    public static void main(String args[]){
        int i;
        asteriscos();
        System.out.println("Números entre 1 e 5");
        asteriscos();
        for(i = 1; i <= 5; i++){
            System.out.println(i);
        }
        asteriscos();
    }
}
