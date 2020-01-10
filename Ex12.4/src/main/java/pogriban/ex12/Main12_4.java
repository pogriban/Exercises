/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex12;

/**
 *
 * @author ThinkPad
 */
public class Main12_4 {

    public static void main(String args[]) {
        StringBuilder d1 = new StringBuilder("wel");
        StringBuilder a = new StringBuilder("Hello");
        System.out.println(a.append("people"));
        String q = "moon@";
        String x1 ="abv4jhr2jknm6";
        String c = "welllcommmmeee";
        StringBuilder zz=new StringBuilder("it is a string");
        System.out.println(index(q));
        welcome(d1);
        System.out.println();
        System.out.println(c+" "+compare(c));
        replace(zz);
        System.out.println(sum(x1));
    }
    static void welcome(StringBuilder d) {
        System.out.println(d);
        for (int i = 0; i < d.length(); i++) {
            System.out.print("" + d.charAt(i) + d.charAt(i));
        }
    }
    static int compare(String com) {
        int counter = 0;
        for (int i = 0; i < com.length() - 2; i++) {
            if ((com.charAt(i) == com.charAt(i + 1)) && (com.charAt(i + 1) == com.charAt(i + 2))) {
                counter++;
            }
        }
        return counter;
    }
    static boolean index(String str) {
        boolean in = false;
        while ((str.indexOf('@') + 1) < str.length()) {
            if (str.charAt(str.indexOf('@') - 1) == str.charAt(str.indexOf('@') + 1)) {
                in = (true);
                break;
            }
        }
        return in;
    }
    static void replace(StringBuilder z){
      String f=z.toString();
      StringBuilder x;
        int is=z.indexOf("is");
      System.out.println(is);
      System.out.println(z.insert(is+3, "not ", 0, 4));
     
     }
    /*  static void sum(StringBuilder xx){
          char [] p=xx.to;
          char []qw={'1','2','3','4','5','6','7','8','9'};
          for (int i = 0; i < xx.length(); i++) {
              for(int j=0; j<qw.length;j++){
            //if ((xx.charAt(i)!=1)&&(xx.charAt(i)!=2)&&(xx.charAt(i)!=3)&&(xx.charAt(i)!=4)&&(xx.charAt(i)!=5)&&(xx.charAt(i)!=6)&&(xx.charAt(i)!=7)&&(xx.charAt(i)!=8)&&(xx.charAt(i)!=9) ){
            if (qw[j]==xx.charAt(i)) 
                
           xx.replace(i, i+1, "0");
            
          
              }
      }
          
         System.out.println(xx);
          //return p;
    }*/
    static int sum(String s) {
        char[] a = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= '0' && a[i] <= '9') {
                sum += Integer.parseInt(String.valueOf(a[i]));
            }
        }
        return sum;
    }
}

