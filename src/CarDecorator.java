public abstract class CarDecorator extends Car {


    public CarDecorator(Car carToDecorate) {
        super(carToDecorate);
        //System.out.println("carDecorator constructor"); //DEBUG LINE
    }

    // public String getDecorations(){
    //     return decorations + carToDecorate.getDecorations();
    // }

    public String getDecorations(){
        //System.out.println("CarDecorator GetDecorations"); //DEBUG LINE
        return decorations + carToDecorate.getDecorations();
    }

    public String getModel(){
        model = this.carToDecorate.model;
        return carToDecorate.model;
    }

    public float getPrice(){
        return price + carToDecorate.getPrice();
    }

    // !!Code commented out, because it served as functionality of a
    // decorator pattern that was not implemented optimally!!

//    public String getColor() {
//        color = this.carToDecorate.color;
//        return color + carToDecorate.getColor();
//    }
}
