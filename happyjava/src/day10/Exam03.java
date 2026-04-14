package day10;

import java.util.*;

class Person{
    private String id;
    private String name;
    private int age;

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}
public class Exam03 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("1","kang",20));
        personList.add(new Person("2",null,26));
        personList.add(new Person("3","hong",37));
        personList.add(new Person("4","lee",7));
        personList.add(new Person("5","go",9));

        //List에 Person 이 저장되어 있는 상태에서.
//        이름이 kang인 사용자의 나이를 알고 싶다면 어떻게 찾아낼까요?
        int age = 0;
        for (int i = 0; i < personList.size(); i++) {
            if("kang".equals(personList.get(i).getName())){
                age = personList.get(i).getAge();
                break;
            }
//            if(personList.get(i).getName().equals("kang")){
//
//            }
        }
        System.out.println("kang 의 나이는 "+age+"입니다.");

        Map<String,Person> personMap = new HashMap<>();
        personMap.put("kang", new Person("1","kang",20));
        personMap.put("kim",new Person("2","kim",26));
        personMap.put("hong",new Person("3","hong",37));
        personMap.put("lee",new Person("4","lee",7));
        personMap.put("go",new Person("5","go",9));

        age = personMap.get("hong").getAge();
        System.out.println("hong 의 나이는 "+age+"입니다.");

    }
}
