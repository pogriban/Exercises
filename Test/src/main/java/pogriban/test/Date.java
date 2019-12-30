/*/clasa Java simpla pentru stocarea unei
 //date calendaristice
 //nu se face validarea datelor
 public class Date
 {
     private int day ;
 private int month ;
 private int year ;
 //constructor far a parametri
 public Date (){
 day = 1 ;
 month = 1 ;
 year = 2000;
}

 //constructor cu trei parametri
 public Date (int theDay , int theMonth , int theYear){

 day = theDay ;
 month = theMonth ;
 year = theYear ;
 }

 //test de egalitate
 //întoarce true daca Obiectul x
 //este egal cu obiectul curent
 public boolean equals ( Object x){
 if (!(x instanceof Date))
 return false ;
 Date date = (Date) x;
 return date. day == day && date. month == month
 && date . year == year ;
 }

 //conversie la St ring
 public String toString (){
 return day + " / " + month + " / " + year ;
 }
 //atribute
 
 }
*/
public class Count {
    
}