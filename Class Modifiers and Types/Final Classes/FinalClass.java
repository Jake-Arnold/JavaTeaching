/**
 * Final classes are classes that cannot be superclasses of another class.
 * <p/>
 * Eg. Class extends FinalClass would result in an error stating that the class "cannot inherit from final class".
 * <p/>
 * <p/>
 * Created by Jake on 6/27/14.
 */
public final class FinalClass {

    public void someMethod() {
        System.out.println("Some method");
    }

    public void someMethod1() {
        System.out.println("Some method 1");
    }
}
