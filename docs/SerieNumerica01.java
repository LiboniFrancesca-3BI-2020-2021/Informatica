/*
Esercizio 7) Far inserire una serie numerica di interi fermandosi quando o la somma di due numeri consecutivi è pari a 10 o quando un numero è uguale al precedente del precedente nella serie numerica
 */
import java.util.*;

public class SerieNumerica01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, numPrecedente, somma;
        numPrecedente = 0;
        somma = 0;
        System.out.println("Inserisci una serie di numeri: ");
        numero = sc.nextInt();
        while (numero!=numPrecedente && somma!=10) {
            numPrecedente = numero;
            numero = sc.nextInt();
            somma = numero+numPrecedente;
        }
        System.out.println("Stop");
    }
}
