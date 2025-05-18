package org.lessons.java.shop;

import java.math.BigDecimal;
//import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){
        Prodotto ombrello = new Prodotto("Ombrello", "Ampio ombrello per giornate super piovose", new BigDecimal(20.564f), new BigDecimal(0.22f));
        //System.out.println(ombrello.getPrezzo().setScale(2, RoundingMode.UP));
        //System.out.println(ombrello.getPrezzoIva().setScale(2, RoundingMode.UP));
        System.out.println(ombrello);

        Smartphone A15 = new Smartphone("A15", "Samsung", new BigDecimal(799.89), new BigDecimal(0.22F), "IMEI978W6", 128);
        System.out.println(A15);

        Televisori Sony = new Televisori("Perfect", "Sony", new BigDecimal(1299.99), new BigDecimal(0.22f), 85, true);
        System.out.println(Sony);

        Cuffie X36 = new Cuffie("X36", "Bose", new BigDecimal(129.99), new BigDecimal(0.22F), "nere", true);
        System.out.println(X36);
    }
} 