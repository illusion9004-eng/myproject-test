package day10;

public class ObjectBox {
    private Object object;

    public void set(Object obj) {
        this.object = obj;
    }

    public Object get() {
        return this.object;
    }


    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.set("1234");
        box.set(10);
        box.set('c');


        Object obj = box.get();

    }
}
