public class DieselSUV extends SUV{
    public DieselSUV(Color color) {
        super(color);
    }
    @Override
    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: SUV");
        System.out.println("Type of engine: Diesel");
        color.getColor();
        System.out.println(getDecorations());
        System.out.println("- - -");
    }

    public String getDecorations() {
        //System.out.println("DieselSUV getDecorations()" +decorations); //DEBUG LINE
        return decorations;
    }
    public float getPrice(){
        return price;
    }

    public String getModel(){
        return model;
    }


}
