public class HydrogenFactory extends Factory {

    public SUV makeSUV(Color color){
        return new HydrogenSUV(color);
    }

    public RaceCar makeRaceCar(Color color){
        return new HydrogenRaceCar(color);
    }
}
