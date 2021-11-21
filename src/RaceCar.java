public abstract class RaceCar extends Car {

    public RaceCar(Color color){
        super(color);
        model = "RaceCar";
        price = 10000;
        decorations = "";
        //System.out.println("RaceCar constructor"); //DEBUG LINE
    }

    @Override
    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: Racecar");
        color.getColor();
        System.out.println("- - -");
    }

    public float getPrice(){
        return price + carToDecorate.price;
    }

    public String getModel(){
        return model;
    }

    public String getDecorations(){
        //System.out.println("RaceCar getDecorations()" +decorations); //DEBUG LINE
        return decorations + carToDecorate.getDecorations();
    }

}
