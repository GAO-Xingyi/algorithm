package Java数据结构与算法.List.SequenceList;

/**
 * 顺序表的实现(数组)
 * 这里定义泛型是用来存储任意类型
 * 知识点一。
 * @param <T>
 */
public class SequenceList<T> {
    // 存储元素的数组
    private T[] eles;
    // 记录当前顺序表中的元素个数
    private int N;

    //构造方法
    public SequenceList(int capacity){
        // 通过指定容量，初始化数组
        // 知识点二
        this.eles = (T[])new Object[capacity];
        // 初始化长度
        this.N = 0;
    }
}

