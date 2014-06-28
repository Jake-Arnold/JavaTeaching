/**
 * Imports are used to access classes that are not in the same package as the class being written in.
 *
 * Eg. to access the class "Class" we would write "import examplepackage.Class".
 *
 * IntelliJ and other IDEs automatically import classes a lot of the time.
 *
 * Created by Jake on 6/27/14.
 */

import examplepackage.Class;

public class StandardImportTest {

    public static void main(String[] args) {

        //The class "Class" is located in the package "examplepackage".
        Class aClass = new Class();

    }
}
