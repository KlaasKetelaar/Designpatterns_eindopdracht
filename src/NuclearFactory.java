public class NuclearFactory extends Factory {

    public SUV makeSUV(Color color){
        return new NuclearSUV(color);
    }

    public RaceCar makeRaceCar(Color color){
        return new NuclearRaceCar(color);
    }
}
