package Exercice1.presentation;

import Exercice1.metier.EntierNaturel;
import Exercice1.metier.NombreNegatifException;

public class Application {
    public Application() {
    }

    public static void main(String[] args) {
        try {
            EntierNaturel entier = new EntierNaturel(5);
            System.out.println("Valeur actuelle : " + entier.getVal());
            entier.setVal(10);
            System.out.println("Nouvelle valeur : " + entier.getVal());
            entier.decrementer();
            System.out.println("Après décrémentation : " + entier.getVal());
            new EntierNaturel(-3);
        } catch (NombreNegatifException var3) {
            System.out.println("Exception : " + var3.getMessage());
            System.out.println("Valeur erronée : " + var3.getValeurErronee());
        }

    }
}
