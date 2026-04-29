package lambdaexam;

@FunctionalInterface
interface PlusFunction {
    int plus(int i, int j);
}

@FunctionalInterface
interface CalFunction {
    int cal(int i, int j);
}

public class PlusFunctionExam {
    public static void main(String[] args) {
        PlusFunction plusFunction = (int i,int j) -> i+j;

        System.out.println(plusFunction.plus(1,2));

        CalFunction plus = (i,j) -> i+j;

        CalFunction minus = (i,j) -> i-j;

        plus.cal(1,2);
        minus.cal(1,2);

    }
}
