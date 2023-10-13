/*
    Titre : Main - Programme PlusGrandeValeur
    Auteur : ARAGRAG AYOUB
    Date : 13-10-2023
    Description: Ce programme principal permet à l'utilisateur de générer un tableau de 15 valeurs aléatoires entre 10 et 100,
                 affiche le tableau, identifie la plus grande valeur dans le tableau ainsi que son index.
    Version : 0.0.1
*/
package devoir2;

import java.util.Scanner;

/**
 * La classe Main est le point d'entrée du programme PlusGrandeValeur.
 * Elle permet à l'utilisateur de choisir le type de liste (ArrayList ou LinkedList),
 * génère le tableau de valeurs aléatoires, et affiche les résultats.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Affiche un message demandant à l'utilisateur de choisir le type de liste
        System.out.println("Choisissez :\n1 pour utiliser ArrayList\n2 pour utiliser LinkedList\n0 Pour sortir");
        int choice = scanner.nextInt();
        
        if (choice == 0) {
            // Affiche un message de sortie si l'utilisateur choisit de quitter
            System.out.println("Sortie du programme.");
            scanner.close();
            return;
        }
        
        if (choice != 1 && choice != 2) {
            // Affiche un message d'erreur si le choix de l'utilisateur est invalide
            System.out.println("Choix invalide.\nSortie du programme.");
            scanner.close();
            return;
        }
        
        // Crée une instance de la classe PlusGrandeValeur
        PlusGrandeValeur pgv_Chiffres = new PlusGrandeValeur();
        
        // Initialise le tableau de valeurs en fonction du choix de l'utilisateur (ArrayList ou LinkedList)
        pgv_Chiffres.initArray(choice);
        
        // Identifie et affiche la plus grande valeur dans le tableau et l'index
        pgv_Chiffres.maxVal();
        
        
        System.out.println("Appuyez sur Entrée pour continuer...");// Affiche un message pour indiquer à l'utilisateur d'appuyer sur Entrée pour continuer
        scanner.nextLine();// Attend l'entrée de l'utilisateur pour éviter la fermeture immédiate de la console
        scanner.close();// Ferme le scanner pour libérer les ressources
    }
}
