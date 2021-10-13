public class Crepe extends Dessert {

    public Crepe() {
        super();
    }

    public String getDescriptif(){
        return "Crepe";
    }

    @Override
    public double calculPrix() {
        return 1.00;
    }
}
