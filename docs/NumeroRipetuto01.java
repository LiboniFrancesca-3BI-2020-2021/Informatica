/*
Esercizio 6) Far inserire una serie numerica di interi fermandosi quando viene inserito due volte consecutive lo stesso numero e visualizzarlo.
 */
import java.util.*;

public class NumeroRipetuto01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, max;
        max = 0;
        System.out.println("Inserisci una serie di numeri: ");
        numero = sc.nextInt();
        while (numero!=max) {
            max = numero;
            numero = sc.nextInt();
        }
        System.out.println(numero);
    }
}
