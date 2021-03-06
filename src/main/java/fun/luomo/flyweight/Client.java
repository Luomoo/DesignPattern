package fun.luomo.flyweight;

/**
 * @author Luomo
 * @date 2020/9/12 16:31
 */
public class Client {


    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");

        System.out.println(chess1);
        System.out.println(chess2);

        chess1.display(new Coordinate(10, 10));
        chess2.display(new Coordinate(20, 30));

    }
}
