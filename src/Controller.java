public class Controller {
    public static void main(String [] args){
        Somme somme = new Somme(3);
        System.out.println(somme.iterrative());
        System.out.println(somme.iterrativeRecurssive(0));

        File file = new File(0,0);
        file.enfiler(25);
        file.enfiler(24);
        file.enfiler(23);
        file.enfiler(22);
        file.enfiler(21);
        file.defiler(2);
        file.lister();

        System.out.println("-----------------------------");
        Liste liste = new Liste(1);
        liste.insereQueue(new Cellule(2,null));
        liste.insereQueue(new Cellule(3,null));
        liste.insereQueue(new Cellule(4,null));
        liste.listeValeurs();
        //System.out.println(liste.calculeTaille());
        //impec
        System.out.println("Valeur de la liste a index 2: " + liste.getVal(2));
        System.out.println("changement d'une valeur 50 à l'index 2");
        liste.setVal(2,50);
        liste.listeValeurs();
        System.out.println("Insersion index 3 valeur 5");
        liste.inserPos(3,new Cellule(5,null));
        liste.listeValeurs();
        System.out.println("liste valeurs après suppresion index 2");
        liste.supprimePos(2);
        liste.listeValeurs();

    }
}
