package Practice.Practice_10;

public class Student implements Comparable<Student> {
    public String name;
    public String surname;
    public String specialty;
    public String course;
    public String group;
    public Integer GPA;

    public Student(String name, String surname, String specialty, String course, String group, int gpa){
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.GPA = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setGPA(Integer GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public Integer getGPA() {
        return GPA;
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
