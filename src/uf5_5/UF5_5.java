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
public class UF5_5 {

    private ArrayList llista;

    public UF5_5() {
        llista = new ArrayList();

    }

    public int CrearRandomNum() {
        int numero = 0;
        /*Cambiar per 1000*/ for (int i = 0; i < 10; i++) {
            numero = (int) (Math.random() * 1000 + 1);
            llista.add(numero);
            Set<Integer> uniqueSet = new HashSet<Integer>(llista);
            for (Integer j : uniqueSet) {
                System.out.println(j + ": " + Collections.frequency(llista, j));
            }
        }
        return numero;
    }

    public int frequencia() {

        return 1;
    }
}
