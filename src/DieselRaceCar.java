public class DieselRaceCar extends RaceCar{
    public DieselRaceCar(Color color) {
        super(color);
    }

    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: Racecar");
        System.out.println("Type of engine: Diesel");
        color.getColor();
        System.out.println("- - -");
    }
//    public String getDecorations(){
//        System.out.println("DieselRaceCar getDecorations" +decorations);
//        return decorations;}
//
//    public float getPrice(){return price;};
//
//    public String getModel(){return model;}


}
