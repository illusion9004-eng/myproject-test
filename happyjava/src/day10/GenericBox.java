package day10;

import java.util.HashSet;
import java.util.Set;

class StringBox{
    private String str;

    public String get() {
        return str;
    }

    public void set(String str) {
        this.str = str;
    }
}

public class GenericBox <T>{
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericBox<String> box = new GenericBox<>();
        box.set("abc");
        box.get().toUpperCase();
        GenericBox<Integer> box2 = new GenericBox<>();
        box2.set(10);
        box2.get().intValue();

        Set<String> set = new HashSet<>();
    }
}
