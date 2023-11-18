package Singleton;

public class MySingleton {
    public static MySingleton mySingleton = null;

    public static MySingleton getInstance() {

        if (mySingleton == null) {
            mySingleton = new MySingleton();
            return mySingleton;
        }
        return mySingleton;
    }
}
