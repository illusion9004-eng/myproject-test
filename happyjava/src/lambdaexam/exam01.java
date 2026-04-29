package lambdaexam;

//클래스에 감싸지 않고, 메서드만 독자적으로 정의 할 수 있나요??  --  자바에서는 없다!!!
//public void test(){
//
//}
class Person{
    public String test(){
        return "test";
    }
}
public class exam01 {
    public int test(int i, int j){
        return i+j;
    }

    Person p = new Person();

    public void test2(Person p){

    }

    public Person test3(){
        return new Person();
    }
}
