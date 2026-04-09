package day07;
class P2{
    private  int x = 100;
    int i = 10;
    public int getI(){
        return i;
    }
}
class C2 extends  P2{
    int i = 20;
    public int getI(){
        return i;
    }

}
public class Test4 {
    public static void print(P2 p){
        System.out.println(p.i);
        System.out.println(p.getI());
    }
    public static void main(String[] args) {

        P2 pc2 = new C2();
        print(pc2);

        C2 cc2 = new C2();
        print(cc2);
//        cc2.x




        P2 p = new P2();
        System.out.println(p.i);
        System.out.println(p.getI());

        C2 c = new C2();
        System.out.println(c.i);
        System.out.println(c.getI());


        P2 pc = new C2();
        System.out.println(pc.i);
        System.out.println(pc.getI());


        if(p instanceof C2) {
            C2 c2 = (C2) p;
        }

    }
}
