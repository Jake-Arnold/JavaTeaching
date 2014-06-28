/**
 *
 * Static imports allow static methods of the staticly imported class to be accessed directly, without referencing that class.
 *
 * Eg. Math.PI could be accessed simply as PI.
 *
 * You can statically import specific methods using "import static class.method", or import all methods from a class using "import static class.*".
 *
 * Created by Jake on 6/27/14.
 */

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class StaticImportTest {

    public static void main(String[] args) {
        //The constant PI and the static method sqrt in Math can now be accessed directly.
        System.out.println(PI);
        System.out.println(sqrt(25));

        //Without the static import they would be accessed as thus.
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(25));

    }
}
