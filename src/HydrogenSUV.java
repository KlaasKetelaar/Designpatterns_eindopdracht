public class HydrogenSUV extends SUV {
    public HydrogenSUV(Color color) {
        super(color);
    }

    @Override
    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: SUV");
        System.out.println("Type of engine: Hydrogen");
        color.getColor();
        System.out.println("- - -");
    }
}
