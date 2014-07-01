import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jake on 01/07/2014.
 */
public class ArrayListTut {

    public static void main(String[] args) {


    /*
     *  The ArrayList
     *
     *  In order to create an instance of ArrayList we can either specify that it is an ArrayList from the start or simply use List.
     *  It is common practice simply to use List as usually you are only interested about what the object actually is (an ArrayList).
     *
     *  The ArrayList in this example will hold Strings.
     *
     *  This will act as an Array of Strings. We can add to the array and remove from the array very simply.
     */

        List<String> stringList = new ArrayList<>();


    /*
     *  Adding to the ArrayList.
     *
     *  It is very simple to add to an ArrayList.
     *
     *  In order to do so, you simply use the .add(String str) method.
     *
     *  It is a String parameter in this case as we have specified that it will hold strings.
     *
     *  We will add the string "Hello".
     *
     *  If we were to then print the stringList we would get [Hello].
     */

        stringList.add("Hello");
        System.out.println(stringList);

     /*
      * Getting values from an ArrayList.
      *
      * We can also get values from certain points in the ArrayList.
      * By default, the first spot in an ArrayList is defined as index 0.
      *
      * Therefore, if we had 5 items in the ArrayList they would be at indexes 0, 1, 2, 3 and 4.
      *
      * We will now add 4 more Strings to the ArrayList and get the value at index 4 using .get(int index).
      *
      */

        stringList.add("This");
        stringList.add("That");
        stringList.add("Who");
        stringList.add("Where");

        //It will print the String at index 4 which will be "Where".
        System.out.println(stringList.get(4));

      /*
       * Checking the size of an ArrayList
       *
       * There is a method named size() that will allow us to get the size of the ArrayList.
       *
       * This is the number of values in the ArrayList.
       *
       * As there are currently 5 Strings in our ArrayList, .size() will return 5.
       */

        System.out.println("There are currently: " + stringList.size() + " values in the ArrayList.");


     /*
      *  Iterating over an ArrayList
      *
      *  This is the final thing we will be talking about here with regards to ArrayLists.
      *
      *  You can iterate over an ArrayList using a for-each loop.
      *
      *  for(String s: stringList){ }
      *
      *  This will go through the the values in the object that implements iterable on the right (stringList)
      *  and assign them to the value of s.
      *
      *  We can then print out the String by using the variable s.
      *
      *  It will print:
      *
      *  Hello
      *  This
      *  Who
      *  What
      *  Where
      *
      */

        for (String s : stringList) {
            System.out.println(s);
        }


        //End of ArrayList tutorial. The LinkedList tutorial will be in a separate class.
    }
}
