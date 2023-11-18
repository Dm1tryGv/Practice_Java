package Practice.Practice_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {
    static SortingStudentsByGPA sort = new SortingStudentsByGPA();

    public static void main(String[] args){
        Student student=new Student("Jane","Lang", 100);
        Student student2=new Student("John","Doe", 200);
        Student student3=new Student("Mike","Alen", 150);
        List<Student> students = Arrays.asList(student, student2,student3);

        System.out.println(students);

        System.out.println(quickSort(students));
    }

    public static List<Student> quickSort(List<Student> students){
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
        answer.addAll(quickSort(l_list));
        answer.addAll(e_list);
        answer.addAll(quickSort(m_list));
        return answer;
    }
}
