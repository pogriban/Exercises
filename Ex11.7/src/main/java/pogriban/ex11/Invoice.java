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
public class Invoice {

    private String partNumber;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String pN, String d, int q, double p) {
        partNumber = pN;
        description = d;
        quantity = q;
        price = p;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>0 ) this.quantity = quantity;
        else this.quantity =0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       if (price>0) this.price = price;
       else this.price=0;
    }

    double getInvoiceAmount() {
        
       return this.quantity * this.price;
        

    }

    void printTotal() {
        System.out.println(getInvoiceAmount());
    }

    public static void main(String arg[]) {
        Invoice a = new Invoice("A1", "Mouse", 10, -12.2);
        Invoice a2 = new Invoice("A2", "Monitor", 10, 12.2);
        a.printTotal();
    }
}
