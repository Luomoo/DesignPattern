package fun.luomo.bridge;

/**
 * @author Luomo
 * @date 2020/9/12 10:02
 */
public interface Brand {
    void sale();

}

class Lenovo implements Brand {

    @Override
    public void sale() {

        System.out.println("销售联想电脑");

    }
}

class Dell implements Brand {

    @Override
    public void sale() {

        System.out.println("销售戴尔电脑");

    }
}