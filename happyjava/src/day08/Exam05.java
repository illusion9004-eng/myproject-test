package day08;
// 인터페이스 정의
interface Drawable {
    void draw();  // public abstract가 자동으로 붙음
    void erase();
}

interface Resizable {
    void resize(double factor);
}
abstract class Shape2 implements Drawable{
    String name;
    public void print(){
        System.out.println(name);
    }
    public abstract double getArea();
}
class Circle2 extends Shape2{
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {

    }

    @Override
    public void erase() {

    }
}
// 여러 인터페이스 구현
class Photo implements Drawable, Resizable {
    private String filename;
    private int width, height;

    public Photo(String filename, int width, int height) {
        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(filename + " 사진을 화면에 그립니다.");
    }

    @Override
    public void erase() {
        System.out.println(filename + " 사진을 화면에서 지웁니다.");
    }

    @Override
    public void resize(double factor) {
        width = (int)(width * factor);
        height = (int)(height * factor);
        System.out.println("크기 조정: " + width + "x" + height);
    }
}
public class Exam05 {
    public static void main(String[] args) {
        Photo photo = new Photo("apple.jpg",50,30);
        photo.draw();
        photo.erase();
        photo.resize(20);

        Drawable d = photo;
        d.draw();
        d.erase();
        Resizable r = photo;
        r.resize(30);
    }
}
