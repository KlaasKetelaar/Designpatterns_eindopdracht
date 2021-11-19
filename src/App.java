public class App {

    public static void main(String[] args) {
        Client gerrit = new Client();

        gerrit.createDieselCar("SUV", "Karen");
        gerrit.createDieselCar("RACECAR", "Caroline", new White());

        gerrit.createHydrogenCar("SUV", "Gerda", new Pearlescent());
        gerrit.createHydrogenCar("Racecar", "Charol", new White());

        gerrit.createNuclearCar("SUV", "Kees");
        gerrit.createNuclearCar("Racecar", "Sjakie");

        gerrit.getCar("Karen").draw();
        gerrit.getCar("Caroline").draw();
        gerrit.getCar("Gerda").draw();
        gerrit.getCar("Charol").draw();
        gerrit.getCar("Kees").draw();
        gerrit.getCar("Sjakie").draw();


    }
}
