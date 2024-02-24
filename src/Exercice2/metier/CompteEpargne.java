package Exercice2.metier;
public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(int numero, double solde, String nom, double tauxInteret) {
        super(numero, solde, nom);
        this.tauxInteret = tauxInteret;
    }

    public void genererInterets() {
        double interets = this.getSolde() * this.tauxInteret;
        this.deposer(interets);
        System.out.println("Intérêts générés sur le compte " + this.getNumero() + ": " + interets);
    }
}