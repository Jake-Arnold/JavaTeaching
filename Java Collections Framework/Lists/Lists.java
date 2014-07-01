import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * The Lists aspect of the collections framework in Java is a very useful tool indeed as it can allow you to store a list of
 * objects or variables in a way that gives you more functionality than in a simple array.
 *
 * There are two main types of List that we will look at here which are ArrayList and LinkedList.
 * Both implement the List interface and therefore can be declared as lists on the left hand side of the variable declaration.
 *
 * Eg. List<Object> list = new ArrayList<>();
 *     List<Object> list1 = new LinkedList<>();
 *
 * All Lists can only contain one type of object which is declared as a generic on creation of the instance of the class.
 * In the above example you can see that <Object> is declared which means that the list can only hold Objects.
 *
 * Don't forget, though, that due to polymorphism, the list can also hold all subclasses of Object.
 *
 *
 * Java 6 and below
 * When instantiating an instance of a List you must declare the generic on both sides of the declaration:
 *
 * Eg. List<Object> list = new ArrayList<Object>();
 *
 * Java 7+
 * In Java 7 generic inference and the diamond type were introduced. This means that generics can be inferred from the initial declaration.
 *
 * Eg. List<Object> list = new ArrayList<>();
 *
 * The <> simply means that it is inferring that it will hold Objects as List<Object> has been previously stated.
 *
 *
 * Created by Jake on 01/07/2014.
 */
public class Lists {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        List<String> linkedList = new LinkedList<>();
    }
}
