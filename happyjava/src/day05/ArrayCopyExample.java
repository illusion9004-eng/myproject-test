package day05;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        //배열 복사
        int[] original = {1,2,3,4,5};

        int[] copy1 = new int[original.length];
        for(int i = 0; i < original.length; i++){
            copy1[i] = original[i]; //깊은복사(값을 복사)
        }

        for (int i = 0; i < copy1.length; i++) {
            System.out.println(copy1[i]);
        }

        int[] copy2 = original; //얕은복사(주소값만복사) //이것은 무엇이 복사된것일까요?

//        copy1과 copy2의 차이점이 있을까요?
        original[0] = 100;
        System.out.println("copy1"+copy1[0]);
        System.out.println("copy2"+copy2[0]);


        // 2. System.arraycopy() 사용
        int[] copy3 = new int[original.length];
        System.arraycopy(original, 0, copy3, 0, original.length);

        original[1] = 200;
        for(int i : copy3){
            System.out.println(i);
        }

        //기본타입은 값을 복사함.
        int value1 = 100;
        int value2 = value1;

        value1 = 200;
        System.out.println(value2);

        char[] cArr = {'a','b'};
        char[] cArr2 = cArr;

        cArr[0] = 'e';
        System.out.println(cArr2[0]);

        byte[] bArr = {5,2,6,7,9};
        byte key = 5;
        int resultIndex = Arrays.binarySearch(bArr, key);
        System.out.println(resultIndex);

        int[] copy4 = Arrays.copyOf(original,original.length);
        for (int i : copy4){
            System.out.println(i);
        }

        String str = new String();
        //배열
        int[] iiarr;  //선언
        iiarr = new int[5]; //배열이 생성
        int[] iiarr2 = new int[3]; //선언과 생성을 동시에.
        //기본적으로 배열은 각 타입의 기본값이 초기값으로 할당됨!!
        int[] iiarr3 = {10,20,30};
        int[] iiarr4 = new int[]{10,20,30,40};

        int[] iiarr5 = iiarr;  //배열이 다시 만들어지지않고, 주소만 복사.

        //주소가 실제 배열이 똑같이 복사되기 위해서는..
        int[] iiarr6 = new int[iiarr.length];
        for (int i = 0; i < iiarr.length; i++) {
            iiarr6[i] = iiarr[i];
        }

        int[] iiarr7 = new int[iiarr4.length];
        System.arraycopy(iiarr4,0,iiarr7,0,iiarr4.length);

        for(int value : iiarr7){
            System.out.println(value);
        }

        int[] iiarr8 = Arrays.copyOf(iiarr4, iiarr4.length);

        System.out.println("==============");
        for(int value : iiarr8){
            System.out.println(value);
        }

        int[] iiarr9 = Arrays.copyOfRange(iiarr4, 1,3);

        System.out.println("==============");
        for(int value : iiarr9){
            System.out.println(value);
        }

    }
}
