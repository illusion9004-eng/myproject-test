package day08;
interface AA{
    void a();
    void b();
}
interface BB{
    void b();
    void c();
}

interface AB extends AA, BB{
    void zz();
    void yy();
    void b();
}
class ABTest implements AB{
    @Override
    public void zz() {

    }

    @Override
    public void yy() {

    }

    @Override
    public void b() {

    }

    @Override
    public void a() {

    }

    @Override
    public void c() {

    }
}
public class Exam07 {
}
