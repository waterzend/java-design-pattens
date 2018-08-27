package singleton;

/**
 * 1、应该避免使用没有调用实例化方法时就已经实例化，浪费资源
 * 2、没有提供任何异常的处理
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
