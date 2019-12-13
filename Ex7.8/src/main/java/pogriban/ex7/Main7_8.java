package pogriban.ex7;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPad
 */
public class Main7_8 {
    public static void main(String args[]){
    Coordonate coord =new Coordonate(); 
    Scanner sc =new Scanner(System.in);
    System.out.println("Introducexi coordonata x ");
    coord.x=sc.nextInt();
    System.out.println("Introducexi coordonata y ");
    coord.y=sc.nextInt();
    coord.aflaCoord();
    
    }
    
}
