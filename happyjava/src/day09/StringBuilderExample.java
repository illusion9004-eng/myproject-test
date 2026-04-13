package day09;

public class StringBuilderExample {
    public static void main(String[] args) {
        String test="";
        for (int i = 0; i < 10; i++) {
            test += i;
        }
        System.out.println(test);

        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }

        String result = sb.toString();
        System.out.println(result);
        System.out.println(System.currentTimeMillis());


        // 성능 비교
        long start = System.currentTimeMillis();

        // String 연결 (비효율적)
        String str = "";
        for(int i = 0; i < 10000; i++) {
            str += i;
        }
        System.out.println("String: " + (System.currentTimeMillis() - start) + "ms");

        // StringBuilder (효율적)
        start = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < 10000; i++) {
            sb2.append(i);
        }
        System.out.println("StringBuilder: " + (System.currentTimeMillis() - start) + "ms");


        start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < 10000; i++) {
            stringBuffer.append(i);
        }
        System.out.println("stringBuffer: " + (System.currentTimeMillis() - start) + "ms");




    }
}
