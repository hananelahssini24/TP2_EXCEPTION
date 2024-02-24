package Exercice2.metier;
public class CompteBancaire {
    private int numero;
    private double solde;
    private String nom;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public CompteBancaire(int numero, double solde, String nom) {
        this.numero = numero;
        this.solde = solde;
        this.nom = nom;
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > this.solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le retrait.");
        } else {
            this.solde -= montant;
        }
    }

    public void afficherSolde() {
        System.out.println("Solde du compte " + this.numero + ": " + this.solde);
    }

    public void transferer(CompteBancaire destinataire, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (montant > this.solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le transfert.");
        } else {
            destinataire.deposer(montant);
            this.retirer(montant);
            this.afficherSolde();
        }
    }

    public String toString() {
        return "CompteBancaire [numero=" + this.numero + ", solde=" + this.solde + ", nom=" + this.nom + "]";
    }
}