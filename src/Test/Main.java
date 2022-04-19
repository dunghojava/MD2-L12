package Test;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Language language1 = new Language("JAVA");
        Language language2 = new Language("C#");
        Language language3 = new Language("PHP");
        Student student1 = new Student(1, "Ho", language1);
        Student student2 = new Student(2, "Anh", language2);
        Student student3 = new Student(3, "Dung", language3);
        Map<Integer, Student> mapStudentID = new HashMap<>();
        mapStudentID.put(student1.getId(), student1);
        mapStudentID.put(student2.getId(), student2);
        mapStudentID.put(student3.getId(), student3);
        mapStudentID.put(4, new Student(4,"Hoang",new Language("JAVASCRIPT")));
        System.out.println(" ============ " + mapStudentID.get(student2.getId()));
        Map<String, Student> mapStudentName = new HashMap<>();
        mapStudentName.put(student1.getName(),student1);
        mapStudentName.put(student2.getName(),student2);
        mapStudentName.put(student3.getName(),student3);
        mapStudentName.put("Hoang", mapStudentID.get(4));
        System.out.println(mapStudentName.get("Hoang"));
        mapStudentID.put(5, new Student(5, "Kien", new Language("C++")));
        mapStudentName.put(mapStudentID.get(5).getName(), mapStudentID.get(5));
        System.out.println("check -------------- " + mapStudentName.get("Kien"));
    }
}
