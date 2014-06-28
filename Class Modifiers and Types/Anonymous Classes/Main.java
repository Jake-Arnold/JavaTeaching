import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * When declaring a method that needs a type of object as a variable you can create an "Anonymous Class" on the spot as a parameter.
 * <p/>
 * They are referred to as anonymous classes due to the fact that the class is not named and only contains methods that have to be implemented.
 * <p/>
 * Anonymous classes can also be interfaces.
 * <p/>
 * Anonymous classes are commonly, but not exclusively, used with the following:
 * <p/>
 * Threads (Creating an anonmyous class of type Runnable);
 * ActionListeners (Creating an anonymous class of type ActionListener);
 * Comparators (Creating an anonymous class of type Comparator);
 * <p/>
 * <p/>
 * Created by Jake on 6/27/14.
 */
public class Main {

    public static void main(String[] args) {

        //For the Runnable argument we declare a new instance of Runnable which implements the run method.
        //It is anonymous as it is not named.
        Thread runnableExample = new Thread(new Runnable() {

            @Override
            public void run() {

            }
        });

        //For the addActionListener, ActionListener argument we declare a new instance of ActionListener which inherits the actionPerformed method.
        JButton button = new JButton();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //For the sort, Comparator<E> argument we declare a new instance of Comparator which inherits the compare method.
        List<String> list = new ArrayList<>();
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

    }
}
