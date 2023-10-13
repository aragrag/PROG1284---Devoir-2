
package devoir2;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choisissez :\n1 pour utiliser ArrayList\n2 pour utiliser LinkedList\n0 Pour sortir");
        int choice = scanner.nextInt();
        
        if (choice == 0) {
            System.out.println("Sortie du programme.");
            scanner.close();
            return;
        }
        
        if (choice != 1 && choice != 2) {
            System.out.println("Choix invalide.\nSortie du programme.");
            scanner.close();
            return;
        }
        
        PlusGrandeValeur pgv_Chiffres = new PlusGrandeValeur();
        
        pgv_Chiffres.initArray(choice);
        pgv_Chiffres.maxVal();
        
        
        System.out.println("Appuyez sur Entrée pour continuer...");
        scanner.nextLine();
        scanner.close();
    }
}
