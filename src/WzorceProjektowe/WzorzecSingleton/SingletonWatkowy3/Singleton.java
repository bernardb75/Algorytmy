package WzorceProjektowe.WzorzecSingleton.SingletonWatkowy3;
//volitile , jesli wątki walczą o instancje
public class Singleton {
    private volatile static Singleton unikalnaInstancja;

    private Singleton(){}

    public static Singleton getUnikalnaInstancja(){
        if (unikalnaInstancja==null){
            synchronized (Singleton.class){
                if (unikalnaInstancja==null){
                    unikalnaInstancja=new Singleton();
                }
            }
        }

        return unikalnaInstancja;
    }
}
