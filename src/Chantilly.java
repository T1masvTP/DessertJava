public class Chantilly extends DessertAvecSupplement{


    public Chantilly(Dessert dessert) {
        super(dessert);
    }
    public String getDescriptif(){
        return getDessert().getDescriptif()+" chantilly";
    }

    public double calculPrix(){
        return getDessert().calculPrix()+0.80;
    }


}
