package fun.luomo.composite;

/**
 * @author Luomo
 * @date 2020/9/12 10:33
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f2, f3, f4, f5;
        Folder f1 = new Folder("我的收藏");
        f2 = new ImagesFile("图片1.jpg");
        f3 = new TextFile("文本1.txt");

        f1.add(f2);
        f1.add(f3);

        Folder f11 = new Folder("我的图片");
        f4 = new ImagesFile("aaa.png");
        f5 = new ImagesFile("bbb.jpg");
        f11.add(f4);
        f11.add(f5);
        f1.add(f11);
//        f4 = new Folder("我的收藏");
//        f5 = new Folder("我的收藏");
//        f6 = new Folder("我的收藏");
        f1.killVirus();

    }
}
