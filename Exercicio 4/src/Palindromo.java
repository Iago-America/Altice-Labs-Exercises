import java.util.Scanner;

public class Palindromo {
    public static void main (String[] args) {
        String o, r = "";
        Scanner in = new Scanner(System.in);
        int l;

        System.out.print("Palavra a verificar > ");

        o = in.nextLine();
        l = o.length();

        in.close();

        for (int i = l - 1; i >= 0; i--) {
            r = r + o.charAt(i);
        }

        if(o.equals(r))
            System.out.println("A palavra "+o+" é um palíndromo!");
        else
            System.out.println("A palavra "+o+" não é um palíndromo!");
    }
}