package fun.luomo.prototype;

import java.util.Date;

/**
 * 浅克隆
 *
 * @author Luomo
 * @date 2020/8/20 10:44
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Date d = new Date(123123123L);

        Sheep s1 = new Sheep("aaa", d);
        Sheep s2 = (Sheep) s1.clone();

        System.out.println(s1);
        System.out.println("修改前："+s1.getBirthday());
        d.setTime(new Date().getTime());
        System.out.println("修改后："+s1.getBirthday());

        s2.setSname("bbb");
        System.out.println(s2);
        System.out.println(s2.getBirthday());

    }

}
