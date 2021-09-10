Easy Java File
class Singleton {

    private static Singleton single_instance = null;


    public String v;

    private Singleton()
    {
        v = "Hello ";
    }


    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}
