public class Navigation extends CarDecorator {

    public Navigation(Car carToDecorate) {
        super(carToDecorate);

        carToDecorate.price = carToDecorate.price + 150;
        carToDecorate.decorations = carToDecorate.decorations + "- Navigation\n";
        //System.out.println("Navigation Constructor" + decorations); DEBUG LINE
    }

    @Override
    public void draw() {

    }
}
