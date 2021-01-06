/*
Scrivere un programma Conteggio che chiede all’utente di inserire un numero maggiore o uguale a zero e stampa uno dopo l’altro tutti i numeri da 0 al numero inserito compreso. Se il valore inserito dall’utente è negativo il programma stampa un messaggio di errore.

Esempio di esecuzione: Inserisci un numero : 5

Ecco il risultato : 0 1 2 3 4 5
 */

import java.util.*;

public class Conteggio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Inserisci un numero: ");
        num = sc.nextInt();
        if (num>=0) {
            System.out.printf("Ecco il risultato: ");
            for (int i=0; i<=num; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("errore");
        }
    }
}
