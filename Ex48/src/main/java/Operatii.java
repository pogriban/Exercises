/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Operatii {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul numar ");
        int a = sc.nextInt();
        System.out.println("Introduceti al doilea numa r");
        int b = sc.nextInt();
        System.out.println("Numerele introduse sunt " + a + " si " + b);
        int adunarea, scaderea, inmul;
        float impart, rest, m;
        adunarea = a + b;
        scaderea = a - b;
        inmul = a * b;
        impart = a / b;
        rest = a % b;
        float q, w;
        q = a;
        w = b;
        m = (q + w) / 2;
        System.out.println("Adunarea " + adunarea);
        System.out.println("Scadearea " + scaderea);
        System.out.println("Inmultirea " + inmul);
        System.out.println("Impartirea " + impart);
        System.out.println("Restul " + rest);
        System.out.println("Media " + m);
    }

}
