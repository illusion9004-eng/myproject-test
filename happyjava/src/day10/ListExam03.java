package day10;

import java.util.*;

public class ListExam03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

//        이 리스트의 값을 모두 꺼내서 출력하고 싶어요.
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("================");
        for(String str : list){
            System.out.println(str);
        }
        System.out.println("================");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        System.out.println("================");
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("================");
        for(String str : set){
            System.out.println(str);
        }
    }
}
