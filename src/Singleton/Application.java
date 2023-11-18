package Singleton;

public class Application {
    public static void main(String[] args) {
        MySingleton instance1 = MySingleton.getInstance();
        MySingleton instance2 = MySingleton.getInstance();
        System.out.println(instance2.equals(instance1));
    }
}
