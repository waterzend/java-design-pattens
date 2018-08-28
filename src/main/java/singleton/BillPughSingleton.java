package singleton;

/**
 * 不太理解内部类
 */
public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE=new BillPughSingleton();
    }

    private static BillPughSingleton getInstance(){
        return  SingletonHelper.INSTANCE;
    }
}
