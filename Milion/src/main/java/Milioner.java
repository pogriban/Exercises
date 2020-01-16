/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author ThinkPad
 */
public class Milioner {
    public static void main(String [] args){
        Intrebari i1=new Intrebari("Ce insectă a scurtcircuitat unul dintre primele computere și a inspirat termenul de bug","A Molie","B Gândac de bucătărie","C Muscă","D Gândac japonez");//corect Molie
        Intrebari i2=new Intrebari("Care dintre următorii oameni de știință nu are un element chimic care să-i poarte numele?","A Albert Einstein","B Niels Bohr","C Isaac Newton","D Enrico Fermi");//corect Niels Bohr
        Intrebari i3=new Intrebari("Care este capitala Republicii Moldova?","A Chisinau","B Balti","C Paris","D Tokyo");//corect Chisinau
        Intrebari i4=new Intrebari("Care dintre următoarele țări este complet înconjurată de o alta?","A Burkina Faso","B Mongolia","C Lesotho","D Luxemburg");//corect Lesotho
        Intrebari i5=new Intrebari("Sub ce nume a rămas cunoscut eroul național al Spaniei, Rodrigo Díaz de Bivar?","A El Cano","B El Greco","C El Cid","D El Salvador");//corect El Cid
        Intrebari i6=new Intrebari("Dacă ai fi Albert King, care ar fi profesia ta?","A Scriitor","B Jurnalist de televiziune","C Pilot de Formula 1","D Muzician");//corect Muzician
        Intrebari i7=new Intrebari("În ce oraș s-a născut celebrul bluesman Alexis Korner?","A Londra","B New York","C Budapesta","D Paris");//corect Paris
        ArrayList <Intrebari> list=new ArrayList<>();
        list.addAll(Arrays.asList(i1,i2,i3,i4,i5,i6,i7));
        System.out.println(list);
    }
}
