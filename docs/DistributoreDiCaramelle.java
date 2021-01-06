/*
Simulare in linguaggio java il funzionamento di una macchinetta distributrice di caramelle che accetta monete e restituisce il resto, fino ad esaurimento delle scorte di caramelle.

Fare il diagramma di flusso dell’algoritmo.

Simulare l’esecuzione del programma con la tabella di traccia.
 */
import java.util.*;

public class DistributoreDiCaramelle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantitaCaramelle, rimaste;
        float prezzo;
        System.out.println("Inserisci la quantita' di caramelle nella macchinetta: ");
        quantitaCaramelle = sc.nextInt();
        rimaste = quantitaCaramelle;
        System.out.println("Inserisci il prezzo di una caramella: ");
        prezzo = sc.nextFloat();
        while (rimaste>0) {
            float denaroInserito, denaroDaPagare, resto, manca;
            int quantita;
            System.out.println("Inserisci la quantita' di caramelle che vuoi comprare: ");
            quantita = sc.nextInt();
            while (quantita>rimaste) {
                System.out.println("Quantita' non valida, ci sono solo " + rimaste + " caramelle rimaste, inserisci la quantita' di caramelle che vuoi comprare: ");
                quantita = sc.nextInt();
            }
            denaroDaPagare = prezzo*quantita;
            System.out.println("Inserisci i soldi: ");
            denaroInserito = sc.nextFloat();
            while (denaroInserito<denaroDaPagare) {
                manca = denaroDaPagare-denaroInserito;
                System.out.printf("Soldi insufficienti, mancano %.2f euro, inserire altri soldi: ", manca);
                denaroInserito += sc.nextFloat();
                
            }
            if (denaroInserito==denaroDaPagare) {
                System.out.println("Grazie per l'acquisto");
                rimaste -= quantita;
            } else {
                resto = denaroInserito-denaroDaPagare;
                System.out.printf("Resto %.2f euro, grazie per l'acquisto\n", resto);
                rimaste -= quantita;
            }
        }
        System.out.println("Caramelle nella macchinetta finite");
    }
}
