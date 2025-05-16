package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{
    private int dimensioni;
    private boolean smart;

    public Televisori (String nome, String marca, BigDecimal prezzo, BigDecimal iva, int dimensioni, boolean smart){
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public Televisori(){        
    }

    public void setDimensioni(int dimensioni){
        if (dimensioni > 0){
            this.dimensioni = dimensioni;
        }
    }

    public int getDimensioni(){
        return this.dimensioni;
    }

    public boolean smart(){
        return smart;
    }

    public void setSmart(boolean smart){
        this.smart = smart;
    }
}
