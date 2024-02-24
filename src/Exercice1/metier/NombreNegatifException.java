package Exercice1.metier;
public class NombreNegatifException extends Exception {
    private int valeurErronee;

    public NombreNegatifException(String message, int valeurErronee) {
        super(message);
        this.valeurErronee = valeurErronee;
    }

    public int getValeurErronee() {
        return this.valeurErronee;
    }
}
