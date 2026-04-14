package day10;

import java.util.*;

class MyObject{
    private String name;

    public MyObject(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return Objects.equals(name, myObject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
public class Exam02 {
    public static void main(String[] args) {
        Set set = new HashSet();

//        초기에는 자료구조안에 Object 타입은 모두 들어갈 수 있었다.
        set.add("test");
        set.add("abc");
        set.add(10);

        Set<String> set2 = new HashSet<>();
        set2.add("test");
//        set2.add(10);
        set2.add("test");
        set2.add("a");
        set2.add("a");
        System.out.println(set2);
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("test");
//        set2.add(10);
        list.add("test");
        list.add("a");

//        메모같은것!! (호박,오이,양배추)
        System.out.println(list.toString());

        MyObject obj1 = new MyObject("연필");
        MyObject obj2 = new MyObject("연필");
        MyObject obj3 = new MyObject("볼펜");

        Set<MyObject> objectSet = new HashSet<>();
        objectSet.add(obj1);
        objectSet.add(obj2);
        objectSet.add(obj3);

        System.out.println(objectSet);


    }
}
