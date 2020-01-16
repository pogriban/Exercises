/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex13;
import java.util.ArrayList;
/**
 *
 * @author ThinkPad
 */
public class main13_4 {
    public static void main (String args[]){
        ArrayList<StringBuilder> list=new ArrayList<>();
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Integer> num1=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num1.add(6);
        num1.add(5);
        num1.add(3);
        num1.add(4);
        StringBuilder k=new StringBuilder("unu");
        StringBuilder k1=new StringBuilder("asdf");
        StringBuilder k2=new StringBuilder("zxcvb");
        list.add(k);
        list.add(k1);
        list.add(k2);
        System.out.println(list);
        for (StringBuilder val:list)
            System.out.println(val);
       String ast=new String("****");
       for (int i=0;i<list.size();i++){
if(list.get(i).length()==4)  list.get(i).insert(0, ast); 
    }
     System.out.println(list);
      for (int i=0;i<list.size();i++){
list.get(i).append('*');    }
     
    
    }}//}

    
