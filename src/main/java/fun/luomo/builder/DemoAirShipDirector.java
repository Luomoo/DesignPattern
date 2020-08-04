package fun.luomo.builder;

/**
 * @author Luomo
 * @date 2020/8/4 17:14
 */
public class DemoAirShipDirector implements AirShipDirector {
    private AirShipBuilder builder;

    public DemoAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = builder.builderEngine();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();
        EscapeTower escapeTower = builder.builderEscapeTower();

        AirShip airShip = new AirShip();
        airShip.setOrbitalModule(orbitalModule);
        airShip.setEngine(engine);
        airShip.setEscapeRower(escapeTower);

        return airShip;
    }
}
