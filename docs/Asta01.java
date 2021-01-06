/*
Esercizio 5) Simulare un’asta in cui ci siano due compratori che si contendono l’acquisto di un oggetto, a turno i due compratori dovranno fare un’offerta per l’oggetto da comprare, l’asta termina quando uno dei due compratori si ritira offrendo ‘0’, a quel punto l’altro compratore si sarà aggiudicato l’asta. Stampare quale compratore si è aggiudicato l’asta e con che cifra.
 */
import java.util.*;

public class Asta01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vincitore;
        float cifra, prezzoFinale;
        prezzoFinale = 0;
        cifra = sc.nextFloat();
        vincitore = 0;
        while (cifra>0) {
            prezzoFinale = cifra;
            cifra = sc.nextFloat();
            vincitore++;
        }
        vincitore--;
        if (vincitore%2==0){
            System.out.println("Vincitore 1 per " + prezzoFinale + " euro");
        } else {
            System.out.println("Vincitore 2 per " + prezzoFinale + " euro");
        }
    }
}
