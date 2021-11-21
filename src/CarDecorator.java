public abstract class CarDecorator extends Car {


    public CarDecorator(Car carToDecorate) { //carDecorator constructor
        super(carToDecorate);
        //System.out.println("carDecorator constructor"); //DEBUG LINE
    }

    public String getDecorations(){ //Adds the added decorations to the list of decorations
        //System.out.println("CarDecorator GetDecorations"); //DEBUG LINE
        return decorations + carToDecorate.getDecorations();
    }

    public String getModel(){ //Returns the model of the decorated vehicle
        model = this.carToDecorate.model;
        return carToDecorate.model;
    }

    public float getPrice(){
        return price + carToDecorate.getPrice();
    }


}
