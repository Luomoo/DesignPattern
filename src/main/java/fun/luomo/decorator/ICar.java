package fun.luomo.decorator;

/**
 * @author Luomo
 * @date 2020/9/12 14:47
 */
public interface ICar {

    void move();

}

class Car implements ICar {

    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}

class SuperCar implements ICar{

    protected ICar iCar;

    public SuperCar(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void move() {
        iCar.move();
    }
}

class FlyCar extends SuperCar{

    public FlyCar(ICar iCar) {
        super(iCar);
    }
    public void fly(){
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

class WaterCar extends SuperCar{

    public WaterCar(ICar iCar) {
        super(iCar);
    }
    public void swim(){
        System.out.println("水上游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}