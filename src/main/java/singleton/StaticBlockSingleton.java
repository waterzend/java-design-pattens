package singleton;

/**
 * 未使用时已经初始化了，浪费资源
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    private StaticBlockSingleton(){}
    static {
        try {
            instance=new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException("Exception occured in creating single instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
