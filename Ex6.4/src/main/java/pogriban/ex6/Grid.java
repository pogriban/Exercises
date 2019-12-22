 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex6;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Grid {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Introduceti numar de coloane si rinduri: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }
    
}
