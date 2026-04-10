package day08;

public final  class Person {
//  필드(속성)은 private 하게 사용하는 것이 일반적이에요.
   private String name;
    private int age;
    private String id = "22222-2222";

    //이런 필드에 대해서 값을 변경하거나, 값을 알려주는 기능이 필요할 것 같아요.
//    setter  /  getter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }
}
