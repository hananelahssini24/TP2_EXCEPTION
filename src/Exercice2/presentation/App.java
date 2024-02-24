package Exercice2.presentation;
import Exercice2.metier.CompteBancaire;
import Exercice2.metier.CompteCourant;
import Exercice2.metier.CompteEpargne;
import Exercice2.metier.CompteInexistantException;
import Exercice2.metier.FondsInsuffisantsException;
import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        ArrayList<CompteBancaire> listeComptes = new ArrayList();
        CompteBancaire compte1 = new CompteBancaire(12345, 1000.0, "John Doe");
        CompteCourant compte2 = new CompteCourant(67890, 500.0, "Jane Doe", 212.0);
        CompteEpargne compte3 = new CompteEpargne(54321, 2000.0, "Alice Smith", 1.0);
        listeComptes.add(compte1);
        listeComptes.add(compte2);
        listeComptes.add(compte3);

        try {
            compte1.deposer(500.0);
            compte1.afficherSolde();
            compte2.retirer(300.0);
            compte2.afficherSolde();
            compte3.transferer(compte1, 1000.0);
            compte3.genererInterets();
            compte1.afficherSolde();
        } catch (CompteInexistantException | FondsInsuffisantsException var8) {
            System.out.println("Erreur : " + var8.getMessage());
        }

        listeComptes.remove(compte2);
        Iterator var6 = listeComptes.iterator();

        while(var6.hasNext()) {
            CompteBancaire compte = (CompteBancaire)var6.next();
            System.out.println(compte);
        }

        try {
            compte2.retirer(100.0);
            compte2.afficherSolde();
        } catch (FondsInsuffisantsException var7) {
            System.out.println("Erreur : " + var7.getMessage());
        }

    }
}