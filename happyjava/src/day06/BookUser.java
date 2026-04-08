package day06;

public class BookUser {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.title);
        book.displayInfo();

        Book book2 = new Book("즐거운 자바");
        book2.displayInfo();

        Book book3 = new Book("모두의 자바","강경미",26000);
        book3.displayInfo();
    }
}
