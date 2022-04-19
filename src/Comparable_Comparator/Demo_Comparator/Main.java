package Comparable_Comparator.Demo_Comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person(1,"A"));
        list.add(new Person(3,"B"));
        list.add(new Person(2,"N"));
        list.add(new Person(5,"A"));
        list.add(new Person(4,"E"));
        list.add(new Person(7,"C"));
        list.add(new Person(6,"D"));

        System.out.println("truoc khi sap xep");
        for (Person p:
             list ) {
            System.out.println(p.getId() + " " + p.getName());

        }

    }
}
