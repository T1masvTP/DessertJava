public class Chocolat extends DessertAvecSupplement{

    public Chocolat(Dessert dessert) {
        super(dessert);
    }
    public String getDescriptif(){
        return getDessert().getDescriptif()+" chocolat";
    }

    public double calculPrix(){
        return getDessert().calculPrix()+0.50;
    }

}
