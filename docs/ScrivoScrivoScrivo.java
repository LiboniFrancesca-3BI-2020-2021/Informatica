/*
Scrivere un programma ScrivoScrivoScrivo che chiede all’utente di inserire un numero maggiore o uguale a zero e stampa il messaggio sto ciclando un numero di volte pari al numero inserito dall’utente. Se il valore inserito dall’utente `e negativo il programma stampa un messaggio di errore.

Esempio di esecuzione:

Inserisci un numero : 5

sto ciclando sto ciclando sto ciclando sto ciclando sto ciclando
 */

import java.util.*;

public class ScrivoScrivoScrivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int num = sc.nextInt();
        if (num>=0) {
            for (int i=0; i<num; i++) {
                System.out.print("sto ciclando ");
            }
        } else {
            System.out.print("errore");
        }
    }
}
