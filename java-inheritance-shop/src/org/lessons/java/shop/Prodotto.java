package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {

    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    public Prodotto(String nome, String marca, BigDecimal prezzo) {
        Random randomGenerator = new Random();
        this.codice = randomGenerator.nextInt(111111111, 999999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = new BigDecimal(0.22f);
    }

    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        Random randomGenerator = new Random();
        this.codice = randomGenerator.nextInt(111111111, 999999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto(){
    };

     public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return this.nome;
    }

    public void setMarca (String marca){
        this.marca = marca;
    }

    public String getMarca (){
        return this.marca;
    }

    public void setPrezzo (BigDecimal prezzo){
        this.prezzo = prezzo;
    }

    public BigDecimal getPrezzoBase(){
        return this.prezzo;
    }

    public BigDecimal getPrezzoIva(){
        return this.prezzo.add(this.prezzo.multiply(this.iva));
    }

    public String getNomeComposto() {
        return this.toString();
    }

    @Override
    public String toString(){
        return String.format("%s-%s", this.codice, this.nome);
    }
}

