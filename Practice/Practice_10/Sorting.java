package Practice.Practice_10;

import java.util.*;

public class Sorting {
    static SortingStudentsByGPA sort = new SortingStudentsByGPA();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество студентов: ");
        int numberOfStudents = scanner.nextInt();

        List<Student> students = setArray(numberOfStudents);

        outArray(students);

        outArray(quickSort(students));
    }

    public static List<Student> quickSort(List<Student> students) {
        if (students.size() <= 1) {
            return students;
        }
        Student q = students.get(0);
        List<Student> l_list = new ArrayList<>();
        List<Student> m_list = new ArrayList<>();
        List<Student> e_list = new ArrayList<>();
        List<Student> answer = new ArrayList<>();
        for(Student n : students){
            if (sort.compare(n, q) > 0){
                m_list.add(n);
            } else if (sort.compare(n, q) < 0) {
                l_list.add(n);
            } else{
                e_list.add(n);
            }
        }
        answer.addAll(quickSort(m_list));
        answer.addAll(e_list);
        answer.addAll(quickSort(l_list));
        return answer;
    }

    public static List<Student> setArray(int number) {
        List<Student> _students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String name;
        String surname;
        String specialty;
        String course;
        String group;
        Integer GPA;

        for(int i = 1; i <= number; i++){
            System.out.println("Введите имя " + i + " студента: ");
            name = scanner.next();
            System.out.println("Введите фамилию " + i + " студента: ");
            surname = scanner.next();
            System.out.println("Введите специальность " + i + " студента: ");
            specialty = scanner.next();
            System.out.println("Введите курс " + i + " студента: ");
            course = scanner.next();
            System.out.println("Введите группу " + i + " студента: ");
            group = scanner.next();
            System.out.println("Введите средний балл " + i + " студента: ");
            GPA = Integer.valueOf(scanner.nextInt());

            _students.add(new Student(name, surname, specialty, course, group, GPA));
        }

        return _students;
    }

    public static void outArray(List<Student> students){
        System.out.println(students);
    }
}
