public class DessertAvecSupplement extends Dessert {

    private Dessert dessert;


    public DessertAvecSupplement(Dessert dessert) {
        super();
        this.dessert = dessert;
    }

    public String getDescriptif(){
        return this.dessert.getDescriptif();
    }

    public double calculPrix(){
        return this.dessert.calculPrix();
    }

    public Dessert getDessert() {
        return dessert;
    }
}