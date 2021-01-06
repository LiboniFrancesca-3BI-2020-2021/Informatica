/*
Scrivere un programma IndovinaZero che chiede all’utente di inserire numeri interi uno dopo l’altro fino a quando non inserisce il numero 0.
 */

import java.util.*;

public class IndovinaZero_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Inserisci un numero: ");
            num = sc.nextInt();
        } while (num!=0);
        System.out.println("Hai inserito lo 0");
    }
}
