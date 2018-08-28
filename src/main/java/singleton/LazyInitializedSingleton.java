package singleton;

/**
 * 这种模式在单线程下工作很好
 * 如果在多线程下，每个线程会产生一个不同的实例
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton(){}
    private static LazyInitializedSingleton getInstance(){
        if (instance==null){
            instance=new LazyInitializedSingleton();
        }
        return instance;
    }
}
