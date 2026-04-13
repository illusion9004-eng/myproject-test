package day09;

public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        if(str1 == str2)
            System.out.println("같은주소");
        else
            System.out.println("다른주소");


        if(str1 == str3)
            System.out.println("str1 == str3 같은주소");
        else
            System.out.println("str1 == str3 다른주소");

        if(str4 == str3)
            System.out.println("str4 == str3 같은주소");
        else
            System.out.println("str4 == str3 다른주소");

        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str1=str1.concat(" world"));
        System.out.println(str1);


        String test="";
        for (int i = 0; i < 10; i++) {
            test += i;
        }
        System.out.println(test);

        System.out.println("a"+"b"+str2+test+" ");

    }
}
