package Comparable_Comparator.Demo_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1,"A"));
        list.add(new Person(5,"N"));
        list.add(new Person(2,"C"));
        list.add(new Person(4,"D"));
        list.add(new Person(3,"A"));
        list.add(new Person(6,"E"));
        for (Person p:
             list) {
            System.out.println(p.getId());
        }
        System.out.println(" ---------------------- ");
        Collections.sort(list);
        for (Person p:
             list) {
            System.out.println(p.getId() + " " + p.getName());
        }
    }

}
