public class DieselFactory extends Factory{

    public SUV makeSUV(Color color){
        return new DieselSUV(color);
    }

    public RaceCar makeRaceCar(Color color){
        return new DieselRaceCar(color);
    }
}
