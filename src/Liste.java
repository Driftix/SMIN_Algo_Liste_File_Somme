public class Liste  {
    private Cellule cellule;

    public Liste(int premiereValeur){
        this.cellule = new Cellule(premiereValeur,null);
    }

    public boolean estVide(){
        return cellule.getCellule() == null;
    }
    public Cellule getPremier(){
        return this.cellule;
    }
    public Cellule getDernier(){
        Cellule tempCell = this.cellule;
        while(tempCell.getCellule() != null){
            tempCell = tempCell.getCellule();
        }
        return tempCell;
    }

    public void insereQueue(Cellule cellule){
        getDernier().setCellule(cellule);
    }

    public void insereTete(Cellule cellule){
        cellule.setCellule(this.cellule);
        this.cellule = cellule;
    }

    public void supprimeTete(){
        Cellule tempCellule = this.cellule.getCellule();
        this.cellule = tempCellule;
    }
    public void supprimeQueue(){
        Cellule tempCell = this.cellule;
        do{
            tempCell = tempCell.getCellule();
        }while(tempCell.getCellule() != null);
        tempCell.setCellule(null);
    }

    public void listeValeurs(){
        Cellule tempCell = this.cellule;
        System.out.println("Liste des valeurs des cellules: ");
        System.out.println(tempCell.getValeur());
        while(tempCell.getCellule() != null){
            tempCell = tempCell.getCellule();
            System.out.println(tempCell.getValeur());
        }
    }

    public int calculeTaille(){
        Cellule tempCell = this.cellule;
        int taille = 0;
        while(tempCell.getCellule() != null){
            tempCell = tempCell.getCellule();
            taille++;
        }
        return taille+1;
    }

    public int getVal(int index){
        Cellule tempCell = parcoursCelluleIndex(index,0);
        return tempCell.getValeur();
    }
    public void setVal(int index, int valeur){
        Cellule tempCell = parcoursCelluleIndex(index,0);
        tempCell.setValeur(valeur);
    }

    public void inserPos(int index, Cellule cellule) {
        if(index != 0) {
            Cellule tempCell = parcoursCelluleIndex(index,0);
            cellule.setCellule(tempCell.getCellule());
            Cellule tempCell2 = parcoursCelluleIndex(index,1);
            tempCell.setCellule(cellule);
        }else{
            System.out.println("index trop petit");
        }
    }
    public void supprimePos(int index){
        if(index != 0) {
            Cellule tempCell1 = parcoursCelluleIndex(index,-1);
            Cellule tempCell2 = parcoursCelluleIndex(index, 1);
            tempCell2.setCellule(tempCell1);
        }else{
            System.out.println("Vous pouvez supprimer la valeur de tete avec supprimeTete()");
        }
    }

    public Cellule parcoursCelluleIndex(int index, int option1){
        Cellule tempCell = this.cellule;
        while(index > 0 + option1){
            tempCell = tempCell.getCellule();
            index--;
        }
        return tempCell;
    }

}
