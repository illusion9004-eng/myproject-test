package day06.test;

public class Person {
    //객체지향에서 속성은 private 하게 사용하는 것이 일반적이다!!
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;

    }

    public String getName(){
        return name;
    }

    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
        System.out.println("나이는 " + this.age + "살입니다.");
        System.out.println("주소는 " + this.address + "입니다.");
    }


    // this를 반환하는 메소드 (메소드 체이닝)
    public Person setAddress(String address) {
//        String address;
        this.address = address;
        return this;  // 현재 객체를 반환
    }


    public static void main(String[] args) {
        Person kang = new Person("kang",30,"경기도 고양시");

        System.out.println(kang.name);

        Person kang1 = kang.setAddress("test");
        String name = kang1.getName();

        String name2 = kang.setAddress("강남구 논현동").getName();
        kang.introduce();

        kang.getName().toUpperCase().trim().length();

    }
}
