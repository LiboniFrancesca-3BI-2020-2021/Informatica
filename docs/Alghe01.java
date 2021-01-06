/*
Esercizio 8) Si supponga che l’andamento della popolazione di un’alga si sviluppi nel seguente modo: un anno raddoppia l’anno successivo cala di un terzo.
Creare un programma che dato un valore iniziale della popolazione e un valore da raggiungere di popolazione dica quanti anni ci mette quella popolazione a raggiungere o superare quel valore.
 */
import java.util.*;

public class Alghe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int popolazione, obiettivo, anni;
        anni = 0;
        System.out.println("Inserisci la quantita' della popolazione: ");
        popolazione = sc.nextInt();
        System.out.println("Inserisci l'obiettivo: ");
        obiettivo = sc.nextInt();
        while (popolazione<obiettivo) {
            popolazione *= 2;
            if (anni%2!=0) {
                popolazione /= 3;
            }
            anni++;
        }
        System.out.println("Servono " + anni + " anni");
    }
}
