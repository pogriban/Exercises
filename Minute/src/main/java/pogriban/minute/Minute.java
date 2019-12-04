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
public class Minute {
    public static void main(String args[])
            {
            float d, y ;
            Scanner sc = new Scanner (System.in);
            System.out.println("Introduceti numarul de min ");
            float b = sc.nextFloat();
            y = b / (525600);           
            System.out.println ( b +"min reprezinta " + y +" ani");
            d = b/1440;
            System.out.println ( b +"min reprezinta " + d +" zile");
            }
    
    
    
}
