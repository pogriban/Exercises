/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex13;
import java.util.ArrayList;
import java.util.ListIterator;
/**
 *
 * @author ThinkPad
 */
public class Main13 {
    public static void main(String args[]) {
        ArrayList<String> arL = new ArrayList<>();
        ArrayList<String> list= new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> arL1 = new ArrayList<>();
        ArrayList<StringBuilder> str = new ArrayList<>();
        System.out.println("ArrayList pina la adaugarea elementelor: " + arL);
        addElements(arL);
        //addElements2(str);
        System.out.println("ArrayList dupa adaugarea elementelor: " + arL);
        System.out.println("Parcurgerea cu for each: ");
        for (String element : arL) {
            System.out.println(element);
        }
        System.out.println("Parcurgerea cu for loop: ");
        for (int i = 0; i < arL.size(); i++) {
            System.out.println(arL.get(i));
        }
        ListIterator<String> iterator = arL.listIterator();
        System.out.println("\nFolosind  ListIterator (while): \n" + iterator.next());
        while (iterator.hasNext()) {
            System.out.println(iterator.next().concat("*"));
        }
        addElements1(arL1);
        arL.addAll(4, arL1);
        System.out.println("ArrayList dupa adaugarea ");
        for (String val : arL) {
            System.out.println(val);
        }
        System.out.println("Am ArrList 2 pina la curatare ");
    for (String val : arL1) {
            System.out.println(val);
        }
    clearOneList(arL1);
    System.out.println("ArrList 2 dupa curatare  ");
    for (String val : arL1) {
            System.out.println(val);
        }
     System.out.println("ArrayList 2 "+arL1);
     replaceElemenet(arL);
     System.out.println("ArrayList dupa inlocuire ");
        for (String val : arL) {
            System.out.println(val);
        }
        removePlurals(arL);
        for(String val:arL)
            System.out.println(val);
        addElements2(str);
        //for(StringBuilder i:str)
          //  System.out.println(i);
        for (int i = 0; i < str.size(); i++) 
            System.out.println(str.get(i).reverse());
        addElements(list);
        addElements(list1);
        System.out.println(list.equals(list1));
           // System.out.println(str.get(i).insert(i, str.get(i).reverse().toString()));
        
        
       /* ListIterator<StringBuilder> iterator1 = str.listIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next().reverse()); 
        }*/
       
    }

    static void addElements(ArrayList q) {
        q.add("unu");
        q.add("doi");
        q.add("trei");
        q.add("patrus");
        //System.out.println(q);
    }
static void addElements2(ArrayList c) {
    StringBuilder cat=new StringBuilder ("cat");
    StringBuilder frog=new StringBuilder ("frog");
    StringBuilder dog=new StringBuilder ("dog");
    StringBuilder cats=new StringBuilder ("cats");
    c.add(cat);
        c.add(dog);
        c.add(frog);
        c.add(cats);
        
        //System.out.println(q);
    }
    static void addElements1(ArrayList q2) {
        q2.add("1");
        q2.add("2");
        q2.add("3");
        q2.add("4");

        //System.out.println(q2);
    }
    static void clearOneList(ArrayList e){
        e.clear();
        
    }
    static void replaceElemenet(ArrayList r){
        r.set(1, "Schimbat");
    }
    static void removePlurals(ArrayList r){
        for (int i = 0; i < r.size(); i++) {
            if(r.get(i).toString().endsWith("s"))
                r.remove(i);
            
                    System.out.println(r.get(i));
        }
        
    }
       
}
