/*
Esercizio 10) Ci sia un  lavandino parzialmente otturato in cui ogni secondo riesce a scaricare solo x cl di acqua e ci sia un rubinetto perde nel lavandino, facendo cadere delle gocce d’acqua nel lavandino per un totale di y cl di acqua tutte in una volta ogni 3 secondi.
Si crei un programma in cui si facciano inserire all’utente i valori di x e y, il livello iniziale dell’acqua e la capacità del lavandino. Il programma deve scrivere l’andamento del livello dell’acqua ogni secondo fino a un massimo di 20 secondi, o fermandosi prima nei casi in cui o il lavandino si è svuotato completamente o se l’acqua ha riempito totalmente il lavandino (o ha strabordato).
 */
import java.util.*;

public class LavandinoOtturato01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int livello, capacita, lavandino, rubinetto, sec;
        sec = 0;
        System.out.println("Inserisci la perdita del lavandino in cl: ");
        lavandino = sc.nextInt();
        System.out.println("Inserisci la perdita del rubinetto in cl: ");
        rubinetto = sc.nextInt();
        System.out.println("Inserisci il livello dell'acqua nel lavandino: ");
        livello = sc.nextInt();
        System.out.println("Inserisci la capacita' del lavandino: ");
        capacita = sc.nextInt();
        while (livello>0 && livello<=capacita && sec<20) {
            sec++;
            if (sec%3==0) {
                livello += rubinetto;
            }
            livello -= lavandino;
            System.out.println("secondo " + sec + ": livello dell'acqua a " + livello + " cl.");
        }
        if (livello<=0) {
            System.out.println("Il lavandino e' vuoto");
        } else if (livello>=capacita) {
            System.out.println("Il lavandino e' pieno");
        }
    }
}
