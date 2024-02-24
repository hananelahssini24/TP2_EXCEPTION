package Exercice1.metier;

public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException("La valeur ne peut pas être négative.", val);
        } else {
            this.val = val;
        }
    }

    public int getVal() {
        return this.val;
    }

    public void setVal(int nouvelleValeur) throws NombreNegatifException {
        if (nouvelleValeur < 0) {
            throw new NombreNegatifException("La nouvelle valeur ne peut pas être négative.", nouvelleValeur);
        } else {
            this.val = nouvelleValeur;
        }
    }

    public void decrementer() throws NombreNegatifException {
        if (this.val == 0) {
            throw new NombreNegatifException("La valeur ne peut pas devenir négative en décrémentant.", this.val);
        } else {
            --this.val;
        }
    }
}
