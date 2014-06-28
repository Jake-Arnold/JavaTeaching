/**
 * This class is used to show how to instantiate an instance of a static class from a different outer class.
 * <p/>
 * Created by Jake on 6/27/14.
 */
public class TestFromOtherClass {

    public static void main(String[] args) {
        //This is how you instantiate an instance of StaticClass from another class.
        OuterClass.StaticClass staticClass = new OuterClass.StaticClass();

        staticClass.println("Hello");
    }
}
