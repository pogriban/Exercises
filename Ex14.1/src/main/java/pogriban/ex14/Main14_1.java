/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author ThinkPad
 */
public class Main14_1 {
    public static void main(String args []){
        LocalDate d2=LocalDate.now();
        System.out.println(d2);
        LocalDate d3=LocalDate.parse("2018-10-31");
         System.out.println(""+d3.getYear()+d3.getMonth()+d3.getDayOfYear());
        LocalDateTime d = LocalDateTime.now();
        //LocalDate d1= LocalDate.of(2019, Month.MARCH, 0);
        DateTimeFormatter form =DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
                
        System.out.println(d.format(form));
        System.out.println(form .format(d));
        
        LocalTime time=LocalTime.now();
       time= time.plusHours(2);
        System.out.println(time);
        LocalDate d4=LocalDate.of(2011, Month.JANUARY, 23);
        LocalDate d5=LocalDate.of(2014, Month.JANUARY, 23);
      Period p=Period.of(d4.getYear(), d4.getMonthValue(), d4.getDayOfMonth());
      System.out.println(d2.minus(p));
      System.out.println(Period.between(d4, d5));
      
      LocalDate q=LocalDate.now();
      System.out.println(""+q.minusDays(10)+"- 10 zile pinala: "+q+", "+q.plusDays(10)+" 10 zile dupa "+q);
      DateTimeFormatter w=DateTimeFormatter.ofPattern("M d, YYYY");
      System.out.println(w.format(q));
      LocalDate q1=LocalDate.of(2020, 01, 01);
      System.out.println(w.format(q1));
      DateTimeFormatter f=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
      System.out.println(f.format(q1));  
        
        //String s="Jan-1-2020";
       // System.out.println(f .format());
//DateTimeFormatter f1=DateTimeFormatter.ofPattern("YYYY-MM-dd");
//LocalDate dg=LocalDate.parse("2057-12-23", f1);
//LocalDate ds=LocalDate.parse(s);
//System.out.println(ds);
      //String date = "2016-08-16";
      String s="Jan-1-2020";
		//default, ISO_LOCAL_DATE
        //LocalDate localDate = LocalDate.parse(date);

        //System.out.println(localDate);  
        LocalDate v1=LocalDate.now(); 
        LocalDate v2=LocalDate.of(1984, 3, 8);
        //System.out.println(v1.minu);
        System.out.println(Period.between(v1, v2));
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");
        
		String date1 = "Jan 1, 2020";

        LocalDate localDate1 = LocalDate.parse(date1, formatter);
 
        System.out.println(localDate1);  //default, print ISO_LOCAL_DATE

        System.out.println(formatter.format(localDate1));

    }
}
