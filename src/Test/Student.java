package Test;

public class Student {
    private int id;
    private String name;
    Language language;

    public Student() {
    }

    public Student(int id, String name, Language language) {
        this.id = id;
        this.name = name;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language=" + language.language +
                '}';
    }
}
