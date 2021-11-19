public abstract class RaceCar extends Car {



    public RaceCar(Color color){
        super(color);
//        model = "RaceCar";
//        price = 10000;
//        decorations = "";
        System.out.println("RaceCar constructor");
    }

    @Override
    public void draw(){
        System.out.println("- - -");
        System.out.println("Type of vehicle: Racecar");
        color.getColor();
        System.out.println("- - -");
    }

//    public String getDecorations(){
//        return decorations;
//    }
//
//    public float getPrice(){
//        return price;
//    }
//
//    public String getModel(){
//        return model;
//    }
//
//    public String getColor(){
//        return color;
//    }
//    public String getDecorations(){
//        System.out.println("RaceCar getDecorations()" +decorations);
//        return decorations + carToDecorate.getDecorations();
//    }
//
//    public float getPrice(){
//        return price;
//    }
//
//    public String getModel(){
//        return model;
//    }
//
//    public String getColor(){
//        return color;
//    }
}
