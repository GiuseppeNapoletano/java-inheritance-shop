package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di prodotti da inserire");
        int numeroProdotti = Integer.parseInt(scanner.nextLine());
        
        Prodotto[] prodotti = new Prodotto[numeroProdotti];
        
        for (int i = 0; i < prodotti.length; i++) {
        System.out.println("Inserisci il nome del prodotto che vuoi inserire:");
        String nomeProdotto = scanner.nextLine();
        
        System.out.println("Inserisci la descrizione del prodotto che vuoi inserire:");
        String descrizioneProdotto = scanner.nextLine();

        System.out.println("Inserisci il prezzo del prodotto che vuoi inserire:");
        BigDecimal prezzoProdotto = new BigDecimal(Float.parseFloat(scanner.nextLine()));

        System.out.println("Quale tipo di prodotto vuoi inserire?");
        System.out.println("Seleziona tra smartphone, tv e cuffie");
        String prodottoSelezionato = scanner.nextLine().trim().toLowerCase();
        
        switch (prodottoSelezionato) {
            case "smartphone":
                System.out.println("Inserisci il codice IMEI di questo smartphone");
                String imei = scanner.nextLine().toUpperCase();
                System.out.println("Quanti giga ha questo cellulare?");
                int giga = Integer.parseInt(scanner.nextLine());

                Smartphone nuovoSmartphone = new Smartphone(nomeProdotto, prodottoSelezionato, prezzoProdotto, prezzoProdotto, imei, giga);
                prodotti[i] = nuovoSmartphone;
                break;

            case "tv":
                System.out.println("Inserisci i pollici di questa televisione");
                int pollici = Integer.parseInt(scanner.nextLine());
                System.out.println("Questa tv e smart?");
                boolean smart = Boolean.parseBoolean(scanner.nextLine());

                Televisori nuovaTv = new Televisori(nomeProdotto, prodottoSelezionato, prezzoProdotto, prezzoProdotto, pollici, smart);
                prodotti[i] = nuovaTv;
                break;

            case "cuffie":
                System.out.println("Inserisci il colore di queste cuffie");
                String colore = scanner.nextLine();
                System.out.println("Queste cuffie sono wireless?");
                boolean wireless = Boolean.parseBoolean(scanner.nextLine());

                Cuffie nuoveCuffie = new Cuffie(nomeProdotto, prodottoSelezionato, prezzoProdotto, prezzoProdotto, colore, wireless);
                prodotti[i] = nuoveCuffie;
                break;
        
            default:
                prodotti[i] = new Prodotto(nomeProdotto, descrizioneProdotto, prezzoProdotto);
                break;
        }
    }
        scanner.close();

        System.out.println("Contenuto del carrello:");
         for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto);
            System.out.println("_____________________");
        }
    } 
}
