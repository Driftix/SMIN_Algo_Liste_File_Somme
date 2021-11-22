public class Somme {
    private double n;

    public Somme(double n ){
        this.n = n;
    }

    public double iterrative(){
        double result =  0;
        for(int i = 0; i < n ; i++){
            result+=i+1;
        }
        return result;
    }

    public double iterrativeRecurssive(double init){
        if(init < this.n){
            init += iterrativeRecurssive(init +1);
        }
        return init;
    }
}
