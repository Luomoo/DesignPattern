package fun.luomo.builder;

/**
 * @author Luomo
 * @date 2020/8/4 17:10
 */
public class DomeAirShipBuilder implements AirShipBuilder {

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("luomo");
    }

    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机");

        return new Engine("luomo");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("luomo");
    }
}
