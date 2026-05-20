package annotation;

import java.lang.reflect.Field;

public class ReflectionExam {
    public static void main(String[] args) throws Exception {
        // Person 클래스의  Class객체
        Class<?> personClass = Class.forName("annotation.Person");
        //Class 객체로 부터 Person 의 인스턴스 생성.
        Object personInstance = personClass.getDeclaredConstructor().newInstance();

        Field nameFiled = personClass.getDeclaredField("name");
        nameFiled.setAccessible(true); //private 필드 접근 가능!!
        nameFiled.set(personInstance,"carami");
    }
}
