public class HydrogenRaceCar extends RaceCar {

    public HydrogenRaceCar(Color color) {
        super(color);
    }
    @Override
    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: Racecar");
        System.out.println("Type of engine: Hydrogen");
        System.out.println("Price of vehicle: " + getPrice());
        color.getColor();
        System.out.println(getDecorations());
        System.out.println("- - -");
    }

    public String getDecorations() {
        //System.out.println("HydrogenRaceCar getDecorations()" +decorations); //DEBUG LINE
        return decorations;
    }
    public float getPrice(){
        return price;
    }

    public String getModel(){
        return model;
    }
}
