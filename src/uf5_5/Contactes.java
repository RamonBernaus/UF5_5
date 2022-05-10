/*2. Dissenya una classe Contactes que emmagatzemi els contactes d'una agenda telefònica
(parells “Nom - Número de telèfon”) en una estructura Map. L'aplicació ha de permetre
l'emmagatzematge, llistat i cerca de nombre de telèfons per nom.*/
package uf5_5;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ausias
 */
public class Contactes {

    public Contactes() {

    }

    Scanner s = new Scanner(System.in);
    private String nom;
    private int numeroTelf;
    private String nomCont;

    public String Contcates() {
        Map<String, Integer> Contactes = new HashMap<String, Integer>();

        System.out.println("Quants numeros de telefon vols guardar? ");
        int numero = s.nextInt();
        for (int i = 0; i < numero; i++) {
            nom = DemanarNom();
            numeroTelf = DemanarNumero();
            Contactes.put(nom, numeroTelf);
        }
        nomCont = BuscarNom();
        if (Contactes.containsKey(nomCont)) {
            System.out.println(Contactes.get(nomCont));
        } else {
      Pattern p = Pattern.compile(nom);
      Matcher m = p.matcher(nomCont);
if (m.find())
         System.err.println("Has escrit " + nomCont + "no volies dir " + nom + "?");
    }
return nom;
}

    public int DemanarNumero() {
        int numeroTelf;
        System.out.println("Quin es el numero de telefon del contacte? ");
        numeroTelf = s.nextInt();
        return numeroTelf;
    }

    public String DemanarNom() {
        String nom;
        System.out.println("Quin es el nom del Contacte? ");
        s.nextLine();
        nom = s.nextLine();
        return nom;
    }

    public String BuscarNom() {
        System.out.println("Quin nom vols buscar dins dels contactes?");
        s.nextLine();
        String str = s.nextLine();
        return str;
    }
}
