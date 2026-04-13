package day09;

import java.util.Arrays;
import java.util.List;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Exam03 {
    public static void main(String[] args) {
        Person kang = new Person("강경미",30);
        System.out.println(kang);




        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list);

        String name = "kang";
        System.out.println(name);
    }
}
