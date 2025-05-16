package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{
    private String imei;
    private int memoria;

    public Smartphone (String nome, String marca, BigDecimal prezzo, BigDecimal iva, String imei, int memoria){
        super(nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }
    
    public Smartphone(){        
    }

    public void setImei(String imei){
        this.imei = imei;
    }

    public String getImei(){
        return this.imei;
    }

    public void setMemoria(int memoria){
        if (memoria > 0){
            this.memoria = memoria;
        }
    }

    public int getMemoria(){
        return this.memoria;
    }
}
