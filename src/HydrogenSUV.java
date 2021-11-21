public class HydrogenSUV extends SUV {
    public HydrogenSUV(Color color) {
        super(color);
    }

    @Override
    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: SUV");
        System.out.println("Type of engine: Hydrogen");
        System.out.println("Price of vehicle: " + getPrice());
        color.getColor();
        System.out.println(getDecorations());
        System.out.println("price:\n"+getPrice());
        System.out.println("- - -");
    }

    public String getDecorations() {
        //System.out.println("HydrogenSUV getDecorations()" +decorations); //DEBUG LINE
        return decorations;
    }
    public float getPrice(){
        return price;
    }

    public String getModel(){
        return model;
    }
}
