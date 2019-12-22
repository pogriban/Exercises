/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main10;
import java.util.Scanner;
/**
 *
 * @author ThinkPad
 */
public class Main10_6 {
    public static void main(String args[]){
        boolean t=false;
        System.out.println(isMultiple(t));
    }
    

static boolean isMultiple(boolean t){
Scanner sc=new Scanner(System.in);

System.out.println("Pentru a iesi ambele numere sa fie 0 ");

System.out.println("introduceti primul numar");
int q=sc.nextInt();
System.out.println("introduceti al doilea numar numar");
int w=sc.nextInt();
//if (w==0){
  //  System.out.println("Impartirea la zero ");
//if((q==w)&&(q==0)) 
if(q%w==0) t=true;
if((q==w)&&(q==0))t=false;

    
//}

return t;
}
}