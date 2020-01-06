package pogriban.main8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ThinkPad
 */
public class Main8_1 {

    public static void main(String args[]) {
        String a = "tRue";
        String a1 = "120";
        String a2 = "32000";
        String a3 = "14";
        String a4 = "987654321987654321";
        String a5 = "4444.5d";
        String a6 = "2354.56f";
        Boolean b = new Boolean(a);
        Boolean b7 = true;//alocare autoboxing
        Byte b8 = 80;
        Character char1 = '3';
        Byte b1 = new Byte(a1); //cu ajutorul constructorului
        Byte b9 = new Byte((byte) 90);
        byte c1 = Byte.parseByte(a1);
        Byte c3 = Byte.valueOf(a1);
        byte cc3 = c3.byteValue();
        Integer bb2 = Integer.valueOf(23456);//cu ajutorul metodei statice valueOf()
        Short b2 = new Short(a2);
        Integer b3 = new Integer(a3);
        Long b4 = new Long(a4);
        Double b5 = new Double(a5);
        Float b6 = new Float(a6);

        Integer num2 = new Integer(10);// unboxing
        int num = num2;////////////////// unboxing
        
        System.out.println("num " + num);
        System.out.println("b " + b);
        System.out.println("b1 " + b1);
        System.out.println("b9 " + b9);
        System.out.println("C1 " + c1);
        System.out.println("c3 " + c3);
        System.out.println("cc3 " + cc3);
        System.out.println("b2 " + b2);
        System.out.println("b3 " + b3);
        System.out.println("b4 " + b4);
        System.out.println("b5 " + b5);
        System.out.println("b6 " + b6);
        System.out.println("b7 " + b7);
        System.out.println("b8 " + b8);
        System.out.println("char1 " + char1);
        System.out.println("bb2 " + bb2);
        


    }
}
