public class Cruisecontrol extends CarDecorator {

    public Cruisecontrol (Car carToDecorate){
        super(carToDecorate);
        price = 2500;
        carToDecorate.decorations = carToDecorate.decorations + "- Cruisecontrol\n";
        carToDecorate.price = + carToDecorate.price + price;
//        this.carToDecorate = carToDecorate;
//        model = this.carToDecorate.model;
    }

    @Override
    public void draw() {

    }
}
