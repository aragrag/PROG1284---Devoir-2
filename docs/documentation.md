# Documentation de PlusGrandeValeur

## Introduction

La classe `PlusGrandeValeur` est conçue pour créer un tableau de 15 cellules, initialisées avec des valeurs aléatoires comprises entre 10 et 100. Le programme affiche ensuite les valeurs du tableau, identifie la plus grande valeur enregistrée dans le tableau et affiche l'index de la cellule contenant cette valeur.

## Utilisation

Pour utiliser la classe `PlusGrandeValeur`, suivez les étapes suivantes :

1. Créez une instance de la classe `PlusGrandeValeur`.
2. Appelez la méthode `initArray(choice)` pour initialiser le tableau avec une implémentation de liste spécifiée (`choice` doit être 1 pour ArrayList ou 2 pour LinkedList).
3. Appelez la méthode `maxVal()` pour trouver la plus grande valeur et son index dans le tableau.
4. Le programme affichera les valeurs du tableau, la plus grande valeur et son index.

### Exemple de code

```java

// Créez une instance de PlusGrandeValeur
PlusGrandeValeur pgv_Chiffres = new PlusGrandeValeur();

// Choisissez l'implémentation de liste (1 pour ArrayList, 2 pour LinkedList)
int choice = 1;
pgv_Chiffres.initArray(choice);

// Trouvez la plus grande valeur et son index
pgv_Chiffres.maxVal();
```

## Exemple de sortie
```java
Choisissez :
1 pour utiliser ArrayList
2 pour utiliser LinkedList
0 Pour sortir
1

*****Affichage du tableau*****
tableau[0] = 63
tableau[1] = 64
tableau[2] = 53
tableau[3] = 36
tableau[4] = 2
tableau[5] = 100
tableau[6] = 86
tableau[7] = 20
tableau[8] = 52
tableau[9] = 38
tableau[10] = 91
tableau[11] = 85
tableau[12] = 34
tableau[13] = 39
tableau[14] = 17

Le plus grand nombre du tableau est : 100
Il est à l'index : 5
Appuyez sur Entrée pour continuer...
```

## Classes principales

### PlusGrandeValeur

- **Méthodes** :
  - `initArray(int choice)`: Cette méthode initialise le tableau en fonction du choix de l'utilisateur (ArrayList ou LinkedList).
  - `maxVal()`: Cette méthode identifie la plus grande valeur dans le tableau et affiche son index.
