public class NuclearRaceCar extends RaceCar {
    public NuclearRaceCar(Color color) {
        super(color);
    }

    @Override
    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: Racecar");
        System.out.println("Type of engine: Nuclear");
        System.out.println("Price of vehicle: " + getPrice());
        color.getColor();
        System.out.println(getDecorations());
        System.out.println("- - -");
    }

    public String getDecorations() {
        //System.out.println("NuclearRaceCar getDecorations()"); //DEBUG LINE
        return decorations;
    }
    public float getPrice(){
        return price;
    }

    public String getModel(){
        return model;
    }

}
