package streamexam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import java.util.*;
import java.util.stream.*;

public class StreamCreation {
    public static void main(String[] args) {
        // List에서 스트림 생성
        List<String> list = Arrays.asList("Java", "Python", "JavaScript");
        Stream<String> streamFromList = list.stream();

        streamFromList.forEach(System.out::println);

        System.out.println("=".repeat(50));

        // Set에서 스트림 생성
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Stream<Integer> streamFromSet = set.stream();
        streamFromSet.forEach(System.out::println);

        System.out.println("=".repeat(50));


        // 배열에서 스트림 생성
        String[] array = {"Spring", "Summer", "Fall", "Winter"};
        Stream<String> streamFromArray = Arrays.stream(array);

        streamFromArray.forEach(System.out::println);
        System.out.println("=".repeat(50));

// 부분 배열에서 스트림 생성
        Stream<String> partialStream = Arrays.stream(array, 0, 3); // Summer, Fall
        partialStream.forEach(System.out::println);

        System.out.println("=".repeat(50));

        // Stream.of() 사용
        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);
        numberStream.forEach(System.out::println);
        System.out.println("=".repeat(50));

// Stream.iterate() - 무한 스트림 생성
        Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 2)
                .limit(10); // 0, 2, 4, 6, 8...

        iterateStream.forEach(System.out::println);
        System.out.println("=".repeat(50));

// Stream.generate() - 무한 스트림 생성
        Stream<Double> randomStream = Stream.generate(Math::random)
                .limit(5);

        randomStream.forEach(System.out::println);



        try {
            Stream<String> lines = Files.lines(Paths.get("src/streamexam/Exam01.java"));
            lines.forEach(System.out::println);
            lines.close(); // 파일 스트림은 반드시 닫아야 함
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
