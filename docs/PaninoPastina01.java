/*
Esercizio 3) Mario è uno studente che ha una quantità di soldi stabilita dall’utente, ogni giorno Mario all’intervallo può acquistare al bar della scuola una pastina che costa 1 euro o un panino che costa 1,5 euro.
Il programma continua a chiedere all’utente cosa mangerà Mario quel giorno finché ha abbastanza soldi o non ha la possibilità di soddisfare il suo appetito con quello che vuole.
Al termine del programma scrivere in output il numero di giorni in cui Mario ha mangiato e quante volte ha mangiato una pastina e quante un panino.
 */
import java.util.*;

public class PaninoPastina01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int giorni, contPanino, contPastina, scelta;
        giorni = 0;
        contPanino = 0;
        contPastina = 0;
        float soldi;
        System.out.println("Inserisci la quantita' di soldi: ");
        soldi = sc.nextFloat();
        while (soldi>=1) {
            System.out.println("Inserisci 0 per un panino e 1 per la pastina: ");
            scelta = sc.nextInt();
            switch (scelta) {
                case 0:
                    if (soldi>=1.50) {
                        soldi -= 1.50;
                        contPanino++;
                    } else {
                        soldi -= 1;
                    }
                    giorni++;
                    break;
                case 1:
                    soldi -= 1;
                    contPastina++;
                    giorni++;
                    break;
                default:
                    System.out.println("numero errato, riprova.");
                    break;
            }
        }
        System.out.println("Mario ha mangiato per " + giorni + " giorni, ha mangiato " + contPanino + " panini e " + contPastina + " pastine.");
    }
}
