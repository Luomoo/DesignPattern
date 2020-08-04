package fun.luomo.builder;

/**
 * @author Luomo
 * @date 2020/8/4 17:16
 */
public class client {
    public static void main(String[] args) {
        AirShipDirector shipDirector = new DemoAirShipDirector(new DomeAirShipBuilder());
        AirShip airShip = shipDirector.directAirShip();
        System.out.println(airShip.getEngine().getName());
        airShip.launcher();

    }
}
