public class Navigation extends CarDecorator {

    public Navigation(Car carToDecorate) {
        super(carToDecorate);
        price = 120;
        carToDecorate.decorations = carToDecorate.decorations + "- Navigation\n";
        carToDecorate.price = + carToDecorate.price + price;
        //System.out.println("Navigation Constructor" + decorations); DEBUG LINE
        //this.carToDecorate = carToDecorate;
        //model = this.carToDecorate.model;
    }

    @Override
    public void draw() {

    }
}
