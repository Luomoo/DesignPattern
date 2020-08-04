package fun.luomo.builder;

/**
 * @author Luomo
 * @date 2020/8/4 17:05
 */
public interface AirShipBuilder {
    OrbitalModule builderOrbitalModule();

    Engine builderEngine();

    EscapeTower builderEscapeTower();

}
