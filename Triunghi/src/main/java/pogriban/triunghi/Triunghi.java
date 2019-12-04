/*;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner();

/**
 *
 * @author ThinkPad
 */
public class Triunghi {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduceti latura a");
    int a=sc.nextInt();
    System.out.println("Introduceti latura b");
    int b=sc.nextInt();
    System.out.println("Introduceti latura c");
    int c=sc.nextInt();
    if ((a!=b)&&(b!=c)&&(a!=c))
    System.out.println("Triunghiul este diferit");
    if ((a==b)&&(b!=c))
    System.out.println("Triunghiul este isoscel");
    if ((a!=b)&&(b==c))
    System.out.println("Triunghiul este isoscel");
    if ((a==c)&&(b!=c))
    System.out.println("Triunghiul este isoscel");
    if ((a==b)&&(b==c)&&(a==c))
    System.out.println("Triunghiul este egal");
    int x=25;
    System.out.println("Math.sqrt(" + x + ")=" + Math.sqrt(x));
    }
}
