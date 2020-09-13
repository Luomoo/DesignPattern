package fun.luomo.iterator;

/**
 * @author Luomo
 * @date 2020/9/13 18:59
 */
public interface MyIterator {
    void first();
    void next();
    boolean hasNext();

    boolean isFirst();
    boolean isLast();

    Object getCurrentObj();





}
