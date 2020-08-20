package fun.luomo.prototype;

import java.io.*;
import java.util.Date;

/**
 * 深复制
 *
 * @author Luomo
 * @date 2020/8/20 10:44
 */
public class Client3 {

    public static void main(String[] args) throws Exception{
        Date d = new Date(123123123L);

        Sheep s1 = new Sheep("aaa", d);

        System.out.println(s1);


        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Sheep s2 = (Sheep) ois.readObject();

        System.out.println("修改前：" + s1.getBirthday());
        d.setTime(new Date().getTime());
        System.out.println("修改后：" + s1.getBirthday());


        s2.setSname("bbb");
        System.out.println(s2);
        System.out.println(s2.getBirthday());

    }

}
