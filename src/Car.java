public abstract class Car {
    public Car carToDecorate;
    public float price;
    protected Color color;
    public String model;
    public String decorations;


    public Car(){
        //System.out.println("Car Constructor without Color parameter"); //DEBUG LINE
    }

    public Car(Car c){
        //carToDecorate = c;
    }

    public Car(Color color) {
        //System.out.println("Car Constructor with Color parameter"); //DEBUG LINE
        this.color = color;
    }

    public abstract void draw();



    public String getDecorations(){
        //System.out.println("Car getDecorations()"); //DEBUG LINE
        return decorations;
    }

    public float getPrice(){return price;}

    public String getModel(){return model;}




// !!Code commented out, because it served as functionality of a decorator pattern that was not implemented optimally!!
//    public String getColor(){return color;}
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