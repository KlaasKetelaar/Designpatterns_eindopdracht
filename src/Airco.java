public class Airco extends CarDecorator{
    public Airco(Car carToDecorate){
        super(carToDecorate);
        price = 5000;
        carToDecorate.decorations = carToDecorate.decorations + "- Airco\n";
//        this.carToDecorate = carToDecorate;
//        model = this.carToDecorate.model;
    }

    @Override
    public void draw() {

    }
}
