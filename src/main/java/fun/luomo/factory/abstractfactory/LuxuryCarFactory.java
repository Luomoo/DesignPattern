package fun.luomo.factory.abstractfactory;

public class LuxuryCarFactory implements CarFactory {


    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tires createTires() {
        return new LuxuryTires();
    }
}