package devoir2;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class PlusGrandeValeur {

    private List<Integer> valeurs;
    private static final int TABLEAU_TAILLE = 15;


    public void initArray(int choice) {
        Random rand = new Random();
        int max = 100;
        int min = 10;

        switch (choice) {
            case 1:
                // Initialiser le tableau avec ArrayList
                this.valeurs = new ArrayList<Integer>();
                break;
            case 2:
                // Initialiser le tableau avec LinkedList
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
