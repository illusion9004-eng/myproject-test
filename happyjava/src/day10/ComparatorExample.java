package day10;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("김철수", 85));
        students.add(new Student("이영희", 92));
        students.add(new Student("박민수", 78));
        students.add(new Student("정수진", 92));

        Collections.sort(students,new StudentComparator());

//        Collections.so

        // 2. Comparator를 이용한 이름순 정렬
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
    }
}
