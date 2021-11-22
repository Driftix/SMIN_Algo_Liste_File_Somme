public class File {
    private double[] file;
    private int indexFirstElement;
    private int indexFreeElement;

    public File(int indexFirstElement, int indexFreeElement){
        file = new double[0];
        this.indexFirstElement = indexFirstElement;
        this.indexFreeElement = indexFreeElement;
    }

    public boolean estVide(){
        if(this.file.length <= 0){
            return true;
        }
        return false;
    }

    public void enfiler(double num){
        int newSize = this.file.length+1;
        double[] tempFile = new double[newSize];

        for(int i = 0; i < this.file.length; i++){
            tempFile[i] = this.file[i];
        }
        tempFile[newSize -1] = num;
        this.file = tempFile;
    }


    public void defiler(int elementIndex){
        double[] tempFile = new double[this.file.length-1];
        int recal = 0;
        if(elementIndex > this.file.length || elementIndex < 0){
            System.out.println("Index hors tableau");
        }else{
            for(int i = 0; i < this.file.length;i++){
                if(i == elementIndex){
                    System.out.println("Suppression de l'element");
                    recal -= 1;
                }else{
                    tempFile[i+recal] = this.file[i];
                }
            }
        }
        this.file = tempFile;
    }


    public void lister(){
        System.out.println("Liste des elements de la plus vieille a la plus récente");
        for(int i = this.file.length-1; i >= 0; i--){
            System.out.println(this.file[i]);
        }
        System.out.println("Liste des elements de la plus récente a la plus vieille");
        for(double d: this.file){
            System.out.println(d);
        }
    }

}
