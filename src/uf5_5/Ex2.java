/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_5;

import java.util.*;

/**
 *
 * @author ausias
 */
public class Ex2 {

    class Contactes {

        Scanner s = new Scanner(System.in);

        public int Contcates() {
            Map<String, Integer> Contactes = new HashMap<String, Integer>();

            

            System.out.println("Quants numeros de telefon vols guardar? ");
            int numero = s.nextInt();
            for (int i = 0; i < numero; i++) {
                
                int numeroTelf = DemanarNumero();
                Contactes.put(nom, numeroTelf);
            }

            return 0;
        }

    public int DemanarNumero() {
        int numeroTelf;
        System.out.println("Quin es el numero de telefon del contacte? ");
        numeroTelf = s.nextInt();
        return numeroTelf;
    }
    public String DemanarNom(){
        String nom;
        System.out.println("Quin es el nom del Contacte? ");
                nom = s.nextLine();
        return nom;
    }
}
}
