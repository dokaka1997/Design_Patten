package singleton_patten;

public class ThreadSafeUpgradeSingleton {
    private static ThreadSafeUpgradeSingleton instance;
    private ThreadSafeUpgradeSingleton(){}

    public static ThreadSafeUpgradeSingleton getInstance(){
        if(instance == null){
            synchronized(ThreadSafeUpgradeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeUpgradeSingleton();
                }
            }
        }
        return instance;
    }
}
