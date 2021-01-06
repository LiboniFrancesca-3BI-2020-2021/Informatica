/*
Esercizio 9) Ogni anno in banca sui conti deposito si accumula un interesse rispetto al saldo iniziale, l’interesse accumulato si somma al saldo precedente e concorrerà al calcolo dell’interesse sull’anno successivo.
Dato un saldo iniziale, la percentuale di interesse e una soglia, verificare  dopo quanti anni si raggiunge o supera la soglia.
 */
import java.util.*;

public class DepositoBancario01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anni;
        float saldo, interesse, obiettivo;
        anni = 0;
        System.out.println("Inserisci il saldo iniziale: ");
        saldo = sc.nextFloat();
        System.out.println("Inserisci la percentuale di interesse: ");
        interesse = sc.nextFloat();
        System.out.println("Inserisci l'obiettivo da raggiungere: ");
        obiettivo = sc.nextFloat();
        while (saldo<obiettivo) {
            saldo += (saldo*interesse/100); //interesse:100=x:saldo   x=saldo*interesse/100
            anni++;
        }
        System.out.println("Si raggiunge l'obiettivo dopo " + anni + " anni");
    }
}
