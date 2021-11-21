import java.util.HashMap;

public class Client {
    private Factory factory = null;

    private HashMap<String, Car> carList = new HashMap<String, Car>(); //Creates a hashmap where all the different cars are stored with the name as a key

    public Car getCar(String carName) { //Gets the car out the hashmap using the name of the car as the key
        return carList.get(carName);
    }

    public void createDieselCar(String cartype, String carName){ //Constructor for making a diesel car
        factory = new DieselFactory(); // makes a new diesel factory
        if (cartype.equalsIgnoreCase("RACECAR")){ //Checks wich type of car the client wants
            carList.put(carName,factory.makeRaceCar(new Black())); //There is no color given in de constructor so the default color of the car is black
                // ^ Puts the car in the hashmap
        }
        else if (cartype.equalsIgnoreCase("SUV")){
            carList.put(carName,factory.makeSUV(new Black()));
        }
        else{
            System.out.println("No car of this type known");
        }
    }

    public void createDieselCar(String cartype, String carName, Color color){ //Here a color is given so a new car is made with that color
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



    public CarDecorator addAccessory(String accessory, Car car){ //Constructor for adding an accessory
        if (accessory == null) {
            System.out.println("No addition specified, car object contains no accessories!");
            return null;
        }
        else if (accessory.equalsIgnoreCase("NAVIGATION")){ //Checking which type of accessory is given so it can be added to the car
            //System.out.println("Client addAccessory method"); //DEBUG LINE
            return new Navigation(car); //Makes a new object for the given accessory
        }
        else if(accessory.equalsIgnoreCase("CRUISECONTROL")){
            return new Cruisecontrol(car);
        }
        else if(accessory.equalsIgnoreCase("AIRCO")){
            return new Airco(car);
        }
        return null;
    }

}
