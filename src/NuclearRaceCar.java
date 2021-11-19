public class NuclearRaceCar extends RaceCar {
    public NuclearRaceCar(Color color) {
        super(color);
    }

    @Override
    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: Racecar");
        System.out.println("Type of engine: Nuclear");
        color.getColor();
        System.out.println("- - -");
    }
}
