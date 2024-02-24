package Exercice2.metier;
public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(int numero, double solde, String nom, double decouvertAutorise) {
        super(numero, solde, nom);
        this.decouvertAutorise = decouvertAutorise;
    }

    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > this.getSolde() + this.decouvertAutorise) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le retrait.");
        } else {
            this.setSolde(this.getSolde() - montant);
        }
    }
}