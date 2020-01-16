/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPad
 */
public class Intrebari {
    private String intrebare;
    private String raspuns1;
    private String raspuns2;
    private String raspuns3;
    private String raspuns4;
    public Intrebari(String intrebare, String raspuns1, String raspuns2, String raspuns3, String raspuns4){
    this.intrebare=intrebare;
    this.raspuns1=raspuns1;
    this.raspuns2=raspuns2;
    this.raspuns3=raspuns3;
    this.raspuns4=raspuns4;
    }

    public String getIntrebare() {
        return intrebare;
    }
    
}