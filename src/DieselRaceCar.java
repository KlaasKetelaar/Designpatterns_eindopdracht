public class DieselRaceCar extends RaceCar{
    public DieselRaceCar(Color color) {
        super(color);
    }

    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: Racecar");
        System.out.println("Type of engine: Diesel");
        System.out.println("Price of vehicle: " + getPrice());
        color.getColor();
        System.out.println(getDecorations());
        System.out.println("price:\n"+getPrice());
        System.out.println("- - -");
    }

    public String getDecorations(){
        //System.out.println("DieselRaceCar getDecorations" +decorations); //DEBUG LINE
        return decorations;}

    public float getPrice(){return price;}

    public String getModel(){return model;}


}
