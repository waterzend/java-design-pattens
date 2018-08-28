package singleton;

/**
 * 线程安全的
 * 在多线程下回降低效率
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}
    private static synchronized ThreadSafeSingleton getInstance(){
        if (instance==null){
            instance=new ThreadSafeSingleton();
        }
        return instance;
    }
}
