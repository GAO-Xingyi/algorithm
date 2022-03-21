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

    public void clear(){
        this.N = 0;
    }

    public boolean isEmpty() {
        return N==0;
    }

    public int length(){
        return N;
    }

    // 获取指定位置的元素
    public T get(int i){
        return eles[i];
    }

    // 向线性表中添加元素t
    public void insert(T t){
        eles[N++] = t;
    }

    // 在i元素处插入元素
    public void insert(int i, T t){
        N++;
        for(int index=N-2; index > i; index--){
            eles[index+1]=eles[index];
        }
        eles[i] = t;
    }

    public T remove(int i){
        T current = eles[i];
        for(int index=i;i<N-1;i++){
            eles[index] = eles[index+1];
        }
        N--;
        return current;
    }

    public int indexOF(T t){
        for (int i=0;i<N;i++){
            if(eles[i].equals(t)){
                return 1;
            }
            }
        return -1;
        }
}


