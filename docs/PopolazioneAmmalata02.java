/*
Esercizio 2) Dato un numero intero che rappresenta un numero di ammalati e un numero reale che rappresenta la percentuale di ammalati che ogni giorno guarisce, calcolare quanti giorni sono necessari affinché il numero di ammalati sia minore di 100.
 */
import java.util.*;

public class PopolazioneAmmalata02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ammalati, giorni;
        float percentuale;
        System.out.println("Inserisci il numero di ammalati: ");
        ammalati = sc.nextInt();
        System.out.println("Inserisci la percentuale di ammalati che guariscono ogni giorno: ");
        percentuale = sc.nextFloat();
        giorni = 0;
        while(ammalati>=100){
            ammalati -= ammalati*percentuale/100;
            giorni++;
        }
        System.out.println("Sono necessari " + giorni + " giorni");
    }
}
