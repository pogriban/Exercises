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
public class Date {
 private static  int day, month, year;
    
public Date(int day, int month, int year){
    setDay(day);
    setMonth(month);
    setYear(year);
    
}
    public static void setDay(int day) {
       if(day>0&&day<31) Date.day = day;
    }

    public static int getDay() {
        return day;
    }

    public static int getMonth() {
        return month;
    }

    public static int getYear() {
        return year;
    }

    public static void setMonth(int month) {
       if(month>0&&month<12) Date.month = month;
    }

    public static void setYear(int year) {
      if(year>0)  Date.year = year;
    }
 
    public void displayDate(){
       System.out.println("data introdusa "+day+"/"+month+"/"+year); 
    }
   public static void main(String args[]){
     
       Date q=new Date(1, 2, 1984);
       q.displayDate();
   } 
}