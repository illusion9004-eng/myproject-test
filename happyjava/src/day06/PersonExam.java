package day06;

public class PersonExam {
    public static void main(String[] args) {
        Person.count++;
//        Person.MAX_AGE = 100;  상수는 값 변경이 안됨.
        int max = Person.MAX_AGE;
        System.out.println(Person.MAX_AGE);

        Person kang = new Person();
        kang.name = "kang kyungmi";
        System.out.println(kang.age);

        System.out.println("test");

    }
}
