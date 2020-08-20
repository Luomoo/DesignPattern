package fun.luomo.prototype;

import java.util.Date;

/**
 * 深复制
 *
 * @author Luomo
 * @date 2020/8/20 10:44
 */
public class Client2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date d = new Date(123123123L);

        Sheep2 s1 = new Sheep2("aaa", d);
        Sheep2 s2 = (Sheep2) s1.clone();


        System.out.println(s1);
        System.out.println("修改前："+s1.getBirthday());
        d.setTime(new Date().getTime());
        System.out.println("修改后："+s1.getBirthday());

        s2.setSname("bbb");
        System.out.println(s2);
        System.out.println(s2.getBirthday());

    }

}
