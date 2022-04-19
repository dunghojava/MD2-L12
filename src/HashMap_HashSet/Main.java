package HashMap_HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
        Student student4 = new Student("Hai",24, "HN");

        Hashtable<Integer, Student> studentMap = new Hashtable<>(10);
        studentMap.put(100,student1);
        studentMap.put(444,student4);
        studentMap.put(223,student2);
        studentMap.put(333,student3);


        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.hashCode()%10+ " ==== " +student.toString());
        }
//        System.out.println("...........Set");
//        Set<Student> students = new HashSet<Student>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student1);
//
//        for(Student student : students){
//            System.out.println(student.toString());
//        }
    }
}
