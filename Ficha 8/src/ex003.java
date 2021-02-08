import java.util.Locale;

public class ex003 {
    static String trimmiddle(String str){
        int i;
        for(i = 0; i < str.length(); i++)
            if(str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
                str = str.replaceAll("  ", " ");
        return str;
    }
    static String strdelc(String str, char ch){
       //boa tarde
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == ch)
                str = str.replaceAll(String.valueOf(ch),"");

        return str;
    }
    static boolean strstr(String str, String substring){
        return str.contains(substring);

    }
    static boolean stricmp(String str1, String str2){
        return str1.equalsIgnoreCase(str2);
    }
    static boolean strcmp(String str1, String str2){
        return str1.equals(str2);
    }
    static boolean strcap(String str){
        String straux = strrev(str);
        return straux.equalsIgnoreCase(str);
    }
    static String strcat(String str1, String str2){
        String s = str1.concat(str2);
        return s;
    }
    static String strcpy(String origem, String destino){
        destino = new String(origem);
        return destino;
    }
    static String trimright(String str){
        str = str.trim();
        return str;
    }
    static String strrev(String str){
        String straux = new StringBuilder(str).reverse().toString();

        return straux;
    }
    static int indchr(String str, char ch){
        int i;
        int n = str.length();

        for(i = 0; i < n; i++)
            if(ch == str.charAt(i))
                return i;

        return i;
    }
    static int strcountc(String str, char ch){
        int count = 0;
        int n = str.length();

        for(int i = 0; i < n; i++)
            if(str.charAt(i) == ch)
                count++;
        return count;
    }
    static String strlwr(String str){
        return str.toLowerCase(Locale.ROOT);
    }
    static int strlen(String str){
        return str.length();
    }
    static boolean isnull(String str){
        return str.isEmpty();
    }

    public static void main(String[] args){
        String str = "A mala  nada na lama";
        char ch = 'a';

        System.out.printf("%s", trimmiddle(str));
    }
}
