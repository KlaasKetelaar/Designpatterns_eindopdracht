public abstract class CarDecorator extends Car {


    public CarDecorator(Car carToDecorate) {
        super(carToDecorate);
        //System.out.println("carDecorator constructor"); //DEBUG LINE
    }

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


}
