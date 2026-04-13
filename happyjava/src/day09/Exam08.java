package day09;
class Book implements Cloneable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // 얕은 복사
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
// getter, setter 생략
}
public class Exam08 {
    public static void main(String[] args) throws Exception{
        Book book = new Book("모두의 자바","강경미");
        Book copyBook = (Book)book.clone();

        System.out.println(copyBook.getAuthor());

        System.out.println(book == copyBook);
    }
}
