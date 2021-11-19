import java.util.HashMap;

public class Client {
    private Factory factory = null;

    private HashMap<String, Car> carList = new HashMap<String, Car>();

    public Car getCar(String carName) {
        return carList.get(carName);
    }

    public void createDieselCar(String cartype, String carName){
        factory = new DieselFactory();
        if (cartype.equalsIgnoreCase("RACECAR")){
            carList.put(carName,factory.makeRaceCar(new Black()));
        }
        else if (cartype.equalsIgnoreCase("SUV")){
            carList.put(carName,factory.makeSUV(new Black()));
        }
        else{
            System.out.println("No car of this type known");
        }
    }

    public void createDieselCar(String cartype, String carName, Color color){
        factory = new DieselFactory();
        if (cartype.equalsIgnoreCase("RACECAR")){
            carList.put(carName,factory.makeRaceCar(color));
        }
        else if (cartype.equalsIgnoreCase("SUV")){
            carList.put(carName,factory.makeSUV(color));
        }
        else{
            System.out.println("No car of this type known");
        }
    }

    public void createHydrogenCar(String cartype, String carName){
        factory = new HydrogenFactory();
        if (cartype.equalsIgnoreCase("RACECAR")){
            carList.put(carName, factory.makeRaceCar(new Black()));
        }
        else if (cartype.equalsIgnoreCase("SUV")){
            carList.put(carName,factory.makeSUV(new Black()));
        }
        else{
            System.out.println("No car of this type known");
        }

    }

    public void createHydrogenCar(String cartype, String carName, Color color){
        factory = new HydrogenFactory();
        if (cartype.equalsIgnoreCase("RACECAR")){
            carList.put(carName, factory.makeRaceCar(color));

        }
        else if (cartype.equalsIgnoreCase("SUV")){
            carList.put(carName,factory.makeSUV(color));

        }
        else{
            System.out.println("No car of this type known");
        }

    }


    public void createNuclearCar(String cartype, String carName){
        factory = new NuclearFactory();
        if (cartype.equalsIgnoreCase("RACECAR")){
            carList.put(carName, factory.makeRaceCar(new Black()));

        }
        else if (cartype.equalsIgnoreCase("SUV")){
            carList.put(carName, factory.makeSUV(new Black()));


        }
        else{
            System.out.println("No car of this type known");
        }

    }

    public void createNuclearCar(String cartype, String carName, Color color){
        factory = new NuclearFactory();
        if (cartype.equalsIgnoreCase("RACECAR")){
            carList.put(carName, factory.makeRaceCar(color));

        }
        else if (cartype.equalsIgnoreCase("SUV")){
            carList.put(carName, factory.makeSUV(color));


        }
        else{
            System.out.println("No car of this type known");
        }

    }



    public CarDecorator addAccessory(String accessory, Car car){
        if (accessory == null) {
            System.out.println("No addition specified, car object contains no accessories!");
            return null;
        }
        else if (accessory.equalsIgnoreCase("NAVIGATION")){
            //System.out.println("Client addAccessory method"); //DEBUG LINE
            return new Navigation(car);
        }
        else if(accessory.equalsIgnoreCase("CRUISECONTROL")){
            return new Cruisecontrol(car);
        }
        else if(accessory.equalsIgnoreCase("AIRCO")){
            return new Airco(car);
        }
        return null;
    }


//TODO: Delete this part of code below if team agrees \/

//    public Color addColor(String color, Car car){
//        if (color == null) {
//            System.out.println("No color specified, car object contains no color!");
//            return null;
//        }
//        else if (color.equalsIgnoreCase("B")){
//            return new RedColor(car);
//        }
//        else if(color.equalsIgnoreCase("BLUE")){
//            return new BlueColor(car);
//        }
//        else if(color.equalsIgnoreCase("BLACK")){
//            return new BlackColor(car);
//        }
//        return null;
//    }
}
