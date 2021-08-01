package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class StartCode {
    public static void main(String[] args) {

        /**
           creating collection

         1) Type Safe --same type of elements(objects) are added to collection


         2)Non Type Safe -- different types of elements can be added to collection



         * */

        // Type safe collection
        ArrayList<String>names  = new ArrayList<String>();
        names.add("Bulbul");
        names.add("Tanjina");
        names.add("Sakib");
        System.out.println(names);
        System.out.println(names.get(1));

        // non type safe
        LinkedList linkedList = new LinkedList();
    }
}
