public class DieselFactory extends Factory{

    public SUV makeSUV(Color color){ //Function for making an SUV in this case an dieselSUV
        return new DieselSUV(color);
    }

    public RaceCar makeRaceCar(Color color){
        return new DieselRaceCar(color);
    }
}
