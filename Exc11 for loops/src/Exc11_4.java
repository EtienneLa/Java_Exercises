import java.util.Scanner;

public class Exc11_4 {

    public static void main(String[]args){

        Scanner keyboard = new Scanner(System.in);
        float s = -10.0f;
        float e = 10.0f;

        for ( float x = s; x <= e; x = x+0.5f) {
            System.out.println("x");
            System.out.println("------");
            System.out.println(x);
        }

    }
}
