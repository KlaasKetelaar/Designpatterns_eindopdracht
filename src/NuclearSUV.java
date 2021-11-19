public class NuclearSUV extends SUV {

    public NuclearSUV(Color color) {
        super(color);
    }

    @Override
    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: SUV");
        System.out.println("Type of engine: Nuclear");
        color.getColor();
        System.out.println("- - -");
    }
}
