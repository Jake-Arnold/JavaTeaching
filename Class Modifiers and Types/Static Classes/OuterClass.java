/**
 * Static Classes can directly be accessed as outer classes despite them being inner classes of another outer class.
 * <p/>
 * For example, this class "OuterClass" can be instantiated as normal, and the static class "StaticClass" can also be instantiated this way.
 * <p/>
 * From another class, however, it cannot be directly accessed as StaticClass but will need to be accessed as OuterClass.StaticClass.
 * <p/>
 * Only nested classes can be static and they cannot access the methods or variables of the outer class that they are nested within unless they are static.
 * <p/>
 * Created by Jake on 6/27/14.
 */
public class OuterClass {


    public static class StaticClass {

        public void println(String str) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        //This is how you create an instance of the outerclass.
        OuterClass outerClass = new OuterClass();

        //This is how you create an instance of the static nested class.
        StaticClass staticClass = new StaticClass();

        staticClass.println("Hello");


    }
}
