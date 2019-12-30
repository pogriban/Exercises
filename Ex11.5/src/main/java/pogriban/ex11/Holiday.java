/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex11;

/**
 *
 * @author ThinkPad
 */
public class Holiday {

    private String name;
    private int day;
    private String month;

    Holiday(String n, int d, String m) {
        name = n;
        day = d;
        month = m;
    }

    /*public static boolean inSameMonth() {
        boolean w;
        Holiday q = new Holiday("AnulNou", 1, "ianuarie");
        Holiday q2 = new Holiday("Craciun Vechi", 7, "ianuarie");
        if ((q.month).equals(q2.month)) {
            w = true;
        } else {
            w = false;
        }
        return w;*/
    boolean inSameMonth(Holiday i) {
return i.mont
    }

    public static double avgDate(int... dayi) {
        int c = 0;
        double avg = 0;
        for (int i = 0; i < dayi.length; i++) {
            c++;
            avg += dayi[i];
        }

        avg = avg / c;
        System.out.println(avg);
        return avg;
    }

    public static void main(String args[]) {
        avgDate(1, 3, 5, 7);
        Holiday h=new Holiday("Independece day", 4, "July");
        Holiday h1=new Holiday("8 Marth", 8, "Marth");
        System.out.println(((h.day)+(h1.day))/2);
        System.out.println(inSameMonth());
    }
}
