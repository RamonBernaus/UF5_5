/*1. Construeix una aplicació que generi de manera aleatòria 1000 valors sencers i calculi la
freqüència d'aparició. Empra una taula que emmagatzemi parells “número - freqüència
absoluta”. La freqüència ha d'implementar-se amb elements d'una classe Comptador, que
emmagatzemi en un atribut privat la freqüència (el nombre d'aparicions) i ofereixi mètodes
per a consultar i incrementar-lo en un.*/
package uf5_5;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author ramon
 */
public class Ex1 {

    private ArrayList llista;
    private int freq;
    public Ex1() {
        llista = new ArrayList();

    }

    public int Comptador() {
        Scanner s = new Scanner(System.in);
        int numero = 0;
        for (int i = 0; i < 1000; i++) {
            numero = (int) (Math.random() * 1000 + 1);
            llista.add(numero);
        }
            System.out.println("Quin numero (del 1 al 1000) vols saber la seva frequencia? ");
            int NumVolsSaber = s.nextInt();
            freq = Collections.frequency(llista, NumVolsSaber);
            System.out.println("El numero ha aparegut un total de: " + freq + " vegades");
        
        return numero;
    }
}

