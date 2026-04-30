package streamexam;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "David");

        // findFirst - 첫 번째 요소
        Optional<String> first = names.stream()
                .filter(name -> name.startsWith("C"))
                .findFirst();

        first.ifPresent(name ->
                System.out.println("C로 시작하는 첫 이름: " + name)
        ); // Charlie

//        System.out.println(first.get());
        System.out.println(first.orElse("값을 찾을수 없어요."));

        // findAny - 아무 요소나 (병렬 처리 시 유용)
        Optional<String> any = names.parallelStream()
                .filter(name -> name.length() > 3)
                .findAny();

        any.ifPresent(name ->
                System.out.println("3자 초과 아무 이름: " + name)
        );
    }
}