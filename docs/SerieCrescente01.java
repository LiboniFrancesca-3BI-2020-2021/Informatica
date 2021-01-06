/*
Esercizio 4) Leggere una serie di numeri interi passati dall’utente, fermandosi al primo numero che rende la serie non crescente e restituendo quanti numeri erano stati inseriti.
 */
import java.util.*;

public class SerieCrescente01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeri, max, numeriInseriti;
        numeriInseriti = 0;
        max = 0;
        System.out.println("Inserisci una serie di numeri: ");
        numeri = sc.nextInt();
        while (max<numeri) {
            numeriInseriti++;
            max = numeri;
            numeri = sc.nextInt();
        }
        System.out.println("Sono stati inseriti " + numeriInseriti + " numeri");
    }
}
