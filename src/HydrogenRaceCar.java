public class HydrogenRaceCar extends RaceCar {

    public HydrogenRaceCar(Color color) {
        super(color);
    }
    @Override
    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: Racecar");
        System.out.println("Type of engine: Hydrogen");
        color.getColor();
        System.out.println("- - -");
    }
}
