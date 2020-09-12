package fun.luomo.composite;

/**
 * @author Luomo
 * @date 2020/9/12 10:21
 */
public interface Component {
    void operation();
}

/**
 * 叶子组件
 */
interface Leaf extends Component {

}

/**
 * 容器组件
 */
interface Composite extends Component {
    void add(Component c);

    void remove(Component c);

    Component getChild(int index);
}
