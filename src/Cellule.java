public class Cellule {
    private int valeur;
    private Cellule cellule;

    public Cellule(int valeur,Cellule cellule){
        this.valeur = valeur;
        this.cellule = cellule;
    }

    public int getValeur() {
        return valeur;
    }
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    public Cellule getCellule() {
        return cellule;
    }
    public void setCellule(Cellule cellule) {
        this.cellule = cellule;
    }

    public String toString(){
        return "valeur de la celulle actuelle" + this.valeur + " connecté a la céllule de valeur " + cellule.getValeur();
    }



}
