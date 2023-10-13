/*
    Titre : PlusGrandeValeur
    Auteur : ARAGRAG AYOUB
    Date : [Date de création du code]
    Description: Ce programme génère un tableau de 15 valeurs aléatoires entre 10 et 100,
                 affiche le tableau, identifie la plus grande valeur dans le tableau ainsi que son index.
    Version : 0.0.1
*/
package devoir2;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * La classe PlusGrandeValeur génère un tableau de valeurs aléatoires, affiche le tableau,
 * et identifie la plus grande valeur dans le tableau ainsi que son index.
 */
public class PlusGrandeValeur {

    private List<Integer> valeurs;
    private static final int TABLEAU_TAILLE = 15;

    /**
     * Initialise le tableau en fonction du choix de l'utilisateur.
     *
     * @param choice Le choix de l'utilisateur (1 pour ArrayList, 2 pour LinkedList).
     */
    public void initArray(int choice) {
        Random rand = new Random();
        int max = 100;
        int min = 10;

        switch (choice) {
            case 1:
                this.valeurs = new ArrayList<Integer>();
                break;
            case 2:
                this.valeurs = new LinkedList<Integer>();
                break;
            default:
                System.out.println("Choix invalide. Sortie du programme.");
                return;
        }

        System.out.println("*****Affichage du tableau*****");
        for (int i = 0; i < TABLEAU_TAILLE; i++) {
            int value = rand.nextInt(max - min + 1) + min;
            this.valeurs.add(value);
            System.out.println("tableau[" + i + "] = " + value);
        }
    }

    /**
     * Identifie la plus grande valeur dans le tableau et affiche son index.
     */
    public void maxVal() {
        int nbrMax = valeurs.get(0);
        int pos = 0;

        for (int i = 1; i < valeurs.size(); i++) {
            if (nbrMax < valeurs.get(i)) {
                nbrMax = valeurs.get(i);
                pos = i;
            }
        }
        System.out.println("Le plus grand nombre du tableau est : " + nbrMax);
        System.out.println("Il est à l'index : " + pos);
    }
}
