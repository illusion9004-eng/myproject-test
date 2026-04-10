package day08;
interface A{
    public void x();
    public void y();
}
interface B{
    public void y();
    public void z();
}

class ABclass implements A,B{
    @Override
    public void x() {

    }

    @Override
    public void y() {

    }

    @Override
    public void z() {

    }
}
public class Exam06 {
    public static void main(String[] args) {
        ABclass aBclass = new ABclass();
        aBclass.y();

        A a = aBclass;
        B b = aBclass;
        a.y();
        b.y();
    }
}
