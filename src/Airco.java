public class Airco extends CarDecorator{
    public Airco(Car carToDecorate){    //Constructor for the airco
        super(carToDecorate);    //Overrides the constructor in carDecorator
        carToDecorate.price = carToDecorate.price + 5000;   //Price of the airco increments the total price
        carToDecorate.decorations = carToDecorate.decorations + "- Airco\n"; //The decoration is added to the list of decorations
    }

    @Override
    public void draw() {

    }
}
