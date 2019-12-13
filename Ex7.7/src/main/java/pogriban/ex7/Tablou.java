/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex7;

/**
 *
 * @author ThinkPad
 */
public class Tablou {

    int items[] = new int[]{1, 2, 3, 4, 5, 6, 5, 7, 8, 9};
    int barray[];
    int sum = 0;
    float average_media = 0;
    int even_par = 0;
    int odd_impar;
    int length = 0;

    void suma() {
        for (int i = 0; i < items.length; i++) {
            sum = items[i] + sum;
        }
        System.out.println("Suma " + sum);
    }

    void media() {
        for (int i = 0; i < items.length; i++) {
            sum = items[i] + sum;
        }
        average_media = sum / items.length;
        System.out.println("Media " + average_media);

    }

    void numPar() {
        int count =0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0) {
                count++;
            }
        }
        barray = new int[count];
        int m = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] % 2 == 0) {
                barray[m] = items[i];
                m++;
            }
        }
        for (int i = 0; i < barray.length; i++) {
            System.out.print(barray[i]+" ");
        }

    }

    void lung() {
        System.out.println();
        System.out.println("Lungimea " + items.length);
    }
}

//[1,2,3,4,5,65,7,8,9,2];

