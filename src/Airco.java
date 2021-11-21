public class Airco extends CarDecorator{
    public Airco(Car carToDecorate){
        super(carToDecorate);
        carToDecorate.price = carToDecorate.price + 5000;
        carToDecorate.decorations = carToDecorate.decorations + "- Airco\n";
        carToDecorate.price = + carToDecorate.price + price;
//        this.carToDecorate = carToDecorate;
//        model = this.carToDecorate.model;
    }

    @Override
    public void draw() {

    }
}
