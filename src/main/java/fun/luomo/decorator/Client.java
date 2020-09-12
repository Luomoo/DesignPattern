package fun.luomo.decorator;

/**
 * @author Luomo
 * @date 2020/9/12 14:51
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("------------------");
        System.out.println("增加新功能");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("------------------");
        System.out.println("增加新功能");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();
    }
}
