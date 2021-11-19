public class App {

    public static void main(String[] args) {
        Client gerrit = new Client();

        gerrit.createDieselCar("SUV", "Karen"); //We create a Diesel car with type of SUV and name Karen
        gerrit.addAccessory("AIRCO", gerrit.getCar("Karen")); //We add Airco to the options of the car Karen

        gerrit.createDieselCar("RACECAR", "Caroline", new White()); //We create a Diesel car with type of SUV, name Caroline and color white
        gerrit.addAccessory("CRUISECONTROL",gerrit.getCar("Caroline")); //We add cruisecontrol to the racecar Caroline, so gerrit can cruise to victory

        gerrit.createHydrogenCar("SUV", "Gerda", new Pearlescent()); //We create a Hydrogen car of type SUV with name Gerda and color Pearlescent
        gerrit.addAccessory("NAVIGATION", gerrit.getCar("Gerda")); //We add navigation to the car Gerda

        gerrit.createHydrogenCar("Racecar", "Charol", new White()); //We create a hydrogen car of type racecar with name Charol and color white

        gerrit.createNuclearCar("SUV", "Kees"); //We create a Nuclear powered car of type SUV and name Kees

        gerrit.createNuclearCar("Racecar", "Max"); //We create a Nuclear powered racecar named Max, so he has enough power to win WDC
        gerrit.addAccessory("NAVIGATION", gerrit.getCar("Max"));
        gerrit.addAccessory("CRUISECONTROL", gerrit.getCar("Max"));
        gerrit.addAccessory("AIRCO", gerrit.getCar("Max"));


        //we draw all the specifications of each of the following cars that our client Gerrit has ordered
        gerrit.getCar("Karen").draw();
        gerrit.getCar("Caroline").draw();
        gerrit.getCar("Gerda").draw();
        gerrit.getCar("Charol").draw();
        gerrit.getCar("Kees").draw();
        gerrit.getCar("Max").draw();

    }
}
