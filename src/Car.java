public abstract class Car {
    protected Color color;

    public Car(Color color) {
        this.color = color;
    }

    public abstract void draw();

// !!Code commented out, because it served as functionality of a decorator pattern that was not implemented optimally!!

//    Car carToDecorate;
//
//    protected float price;
//    public String model;
//    public String decorations;
//    public String color;
//
//    public Car(){
//
//    }
//
//    public String getDecorations(){
//        System.out.println("Car getDecorations()");
//        return decorations;
//    }
//
//    public void getDecorations2(){System.out.println(decorations);}
//
//    public float getPrice(){return price;};
//
//    public String getModel(){return model;}
//
//    public String getColor(){return color;}
//
//    void draw(){
//        System.out.println("---------");
//        System.out.println("Model: " + GetColor());
//        System.out.println("Price: " + getPrice());
//        System.out.println("Car draw()");
//        System.out.println("Decorations:\n" + getDecorations());
//
//
//    }


}