package day07;

public class Student {
    // 인스턴스 필드 - 인스턴스화 될 때 생성됨.
    String name;
    int score;

    //클래스 필드 - 메모리에 미리 올라간다. 공간이 하나만 생겨서 모두 공유!!
    static int totalStudents = 0;
    static int totalScore = 0;

    // 생성자
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        totalStudents++;
        totalScore += score;
    }

    // 인스턴스 메소드
    public void displayInfo() {
        System.out.println(totalStudents);
        System.out.println(totalScore);
        System.out.println(name + ": " + score + "점");
    }

    // 클래스 메소드
    public static double getAverage() {
        if(totalStudents == 0) return 0;
//        System.out.println(name); - 클래스메소드는 인스턴스가 생성되지 않아도 사용가능하므로!!
        return (double)totalScore / totalStudents;
    }

    public static void main(String[] args) {
//        Student.totalStudents = 33;
//        Student.totalScore = 1000;

        System.out.println(Student.getAverage());

        Student kang = new Student("kang",100);
        Student kim = new Student("kim",80);
        Student hong = new Student("hong",70);
        Student lee = new Student("lee",99);

        System.out.println(Student.getAverage());
    }
}
