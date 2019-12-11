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

    int array[] = new int[]{1, 2, 3, 4, 5, 6, 5, 7, 8, 9};
    int barray[]=new int[10];
    int sum = 0;
    int k=0;
    float average_media = 0;
    int even_par = 0;
    int odd_impar;
    int length = 0;

    void suma() {
        for (int i = 0; i < array.length; i++) 
        {sum=array[i]+sum;}
            System.out.println("Suma " + sum);
        }
        void media (){
        for (int i = 0; i < array.length; i++) 
        {sum=array[i]+sum;}
                average_media = sum / array.length;
                System.out.println("Media " + average_media);

            }
        void numPar(){
            for(int i=0;i<array.length;i++){
                if(array[i]%2==0)
                    
                    barray[i]=array[i];                    
            }
            for (int i=0;i<barray.length;i++)
                System.out.println(barray[i]);
        }
        }
    
//[1,2,3,4,5,65,7,8,9,2];


