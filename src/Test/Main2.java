package Test;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<Integer, Student> mapStudentId = new HashMap<>();
        mapStudentId.put(1, new Student(1, "Dung", new Language("Java")));
        mapStudentId.put(2, new Student(2, "Kien", new Language("JavaScript")));
        mapStudentId.put(3, new Student(3, "Hoang", new Language("PHP")));
        mapStudentId.put(4, new Student(4, "Phong", new Language("C#")));
//        System.out.println(mapStudentId.get(3));
        Map<String, Student> mapStudentName = new HashMap<>();
        mapStudentName.put(mapStudentId.get(1).getName(), mapStudentId.get(1));
        System.out.println("check ------------ " + mapStudentName.get("Dung"));

    }
}
