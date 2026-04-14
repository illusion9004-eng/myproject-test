package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class MyString implements Comparable<MyString>{
    String value;
    MyString(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int compareTo(MyString o) {
        return this.value.compareTo(o.value);
    }
}

public class Exam04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("f");
        list.add("b");
        list.add("a");
        list.add("d");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("====myString======");

        List<MyString> myList = new ArrayList<>();
        myList.add(new MyString("f"));
        myList.add(new MyString("b"));
        myList.add(new MyString("a"));
        myList.add(new MyString("d"));

        System.out.println(myList);
        Collections.sort(myList);//정렬기준!!
        System.out.println(myList);

    }
}
