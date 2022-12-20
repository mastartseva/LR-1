package task1;

class Conection {

    private static Conection instance;

    private Conection() {}

    // всякие разные методы данного класса
    // .
    // .
    // .
    // конец всяких методов

    public static Conection getInstance() {
        if(null != instance)
            return instance;

        instance = new Conection();
        return instance;
    }
}