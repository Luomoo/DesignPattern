package fun.luomo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Luomo
 * @date 2020/9/12 10:25
 */
public interface AbstractFile {
    //杀毒
    void killVirus();
}

class ImagesFile implements AbstractFile {

    private String name;

    public ImagesFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("图像文件:" + name + "进行查杀");

    }
}

class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("文本文件:" + name + "进行查杀");

    }
}

class Folder implements AbstractFile {
    private String name;
    private List<AbstractFile> list = new ArrayList<AbstractFile>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        list.add(file);
    }

    public void remove(AbstractFile file) {
        list.add(file);
    }

    public AbstractFile getChild(int index) {
        return list.get(index);
    }


    @Override
    public void killVirus() {
        System.out.println("文件夹:" + name + "进行查杀");

        for (AbstractFile file : list) {
            file.killVirus();
        }
    }
}