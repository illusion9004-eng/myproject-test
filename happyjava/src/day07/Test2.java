package day07;
class P{
    int i = 10;

}
class C extends P{
    int i = 10;
    int j = 20;

    public void print(){
        System.out.println("test");
    }
}
public class Test2 {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;

        b = (byte)i;

        //객체들 사이에서 형변환이 필요한 이유~~~

        P pc = new C();
        System.out.println(pc.i);
        System.out.println(((C)pc).j);
        C c = (C)pc;
        System.out.println(c.j);
        c.print();

        P p = c;  //묵시적 형변환
        C cc = (C)p;  //명시적 형변환



    }
}
