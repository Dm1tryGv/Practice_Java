package Practice.Practice_9;

public class Student implements Comparable<Student> {
    public String name;
    public String surname;
    public Integer GPA;

    public Student(String name, String surname, int gpa){
        this.name = name;
        this.surname = surname;
        this.GPA = gpa;
    }

    @Override
    public int compareTo(Student student) {
        return this.GPA.compareTo(student.GPA);
    }

    @Override
    public String toString() {
        return "Student(" +
                "name=" + name +
                ", surname=" + surname +
                ", GPA=" + GPA +
                ')';
    }
}
