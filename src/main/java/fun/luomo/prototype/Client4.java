package fun.luomo.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 深复制
 *
 * @author Luomo
 * @date 2020/8/20 10:44
 */
public class Client4 {
    public static void testNew(int size) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop laptop = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("New创建完成,耗时" + (end - start));

    }

    public static void testClone(int size) throws CloneNotSupportedException {

        Laptop t = new Laptop();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {

                Laptop temp = (Laptop) t.clone();


        }
        long end = System.currentTimeMillis();
        System.out.println("Clone创建完成,耗时" + (end - start));

    }

    public static void main(String[] args) throws Exception {
        testNew(1000);
        testClone(1000);

    }

}

class Laptop implements Cloneable{
    public Laptop() {
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
