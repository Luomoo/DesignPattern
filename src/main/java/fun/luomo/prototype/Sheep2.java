package fun.luomo.prototype;

import java.util.Date;

/**
 * @author Luomo
 * @date 2020/8/20 10:40
 */
public class Sheep2 implements Cloneable {
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();

//      -----深复制----------------
        Sheep2 s = (Sheep2) obj;
        s.birthday = (Date) this.birthday.clone();
//      -----深复制----------------

        return obj;
    }

    public Sheep2() {
    }

    public Sheep2(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
