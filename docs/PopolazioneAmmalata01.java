/*
esercizio 1) Creare un programma che, dati due valori che rappresentano rispettivamente

a) il tasso di propagazione di un virus (quante nuove persone ogni giorno si ammalano per ogni persona già ammalata) e

b) la quantità di persone di una popolazione,

dica quanti giorni sono necessari perché sia ammalata almeno la metà della popolazione considerando che all’inizio ci sia una sola persona ammalata.
 */
import java.util.*;

public class PopolazioneAmmalata01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int popolazione, giorni;
        float tasso, quantita;
        System.out.println("Inserisci il tasso di di propagazione del virus: ");
        tasso = sc.nextFloat();
        System.out.println("Inserisci la quantita' di persone: ");
        popolazione = sc.nextInt();
        quantita = 1;
        giorni = 0;
        while(quantita<(popolazione/2)){
            quantita += (quantita*tasso/100);
            giorni++;
        }
        System.out.println("Sono necessari " + giorni + " giorni");
    }
}
