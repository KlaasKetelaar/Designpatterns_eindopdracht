public abstract class SUV extends Car{

     public SUV(Color color){
         super(color);
//         model = "SUV";
//         price = 5000;
//         decorations = "";
         System.out.println("SUV constructor");
     }

     @Override
    public void draw(){
         System.out.println("- - -");
         System.out.println("Type of vehicle: SUV");

         color.getColor();
         System.out.println("- - -");
     }



//
//     public String getDecorations() {
//         System.out.println("SUV getDecoration()");
//         return decorations + carToDecorate.getDecorations();
//     }
//
//     public String getModel(){
//         return model;
//     }
//
//     public float getPrice() {
//         return price;
//     }

//    public String getDecorations(){
//        System.out.println("5555" +decorations);
//        return decorations;}
//    public float getPrice(){
//         return price;
//     };
//
//    public String getModel(){
//        return model;
//    }


}