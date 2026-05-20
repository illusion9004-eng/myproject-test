package annotation;

public class Person {
    private String name;
    private int age;

    public Person(){
        this.name = "아무개";
        this.age = 0;
    }

    private void sayHello(){
        System.out.println("안녕 내 이름은 "+ this.name);
    }
}
