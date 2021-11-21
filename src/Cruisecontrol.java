public class Cruisecontrol extends CarDecorator {

    public Cruisecontrol (Car carToDecorate){
        super(carToDecorate);
        carToDecorate.price = carToDecorate.price + 2500;
        carToDecorate.decorations = carToDecorate.decorations + "- Cruisecontrol\n";
    }

    @Override
    public void draw() {

    }
}
