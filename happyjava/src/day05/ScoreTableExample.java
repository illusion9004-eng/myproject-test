package day05;

public class ScoreTableExample {
    public static void main(String[] args) {
        // 학생별 과목 점수 (3명의 학생, 4과목)
        String[] students = {"김철수", "이영희", "박민수"};
        String[] subjects = {"국어", "영어", "수학", "과학"};
        int[][] scores = {
                {90, 85, 88, 92},  // 김철수
                {85, 90, 95, 88},  // 이영희
                {78, 82, 85, 90}   // 박민수
        };

        // 성적표 출력
        System.out.println("=== 성적표 ===");
        System.out.print("이름\t\t");
        for (String subject : subjects) {
            System.out.print(subject + "\t");
        }
        System.out.println("총점\t평균");
        System.out.println("-".repeat(50));
        //아래 문장들이 왜 오류가 나는지 이해된다.
//        System.out.println("-".repeat(50,20));
//        System.out.println("_".repeat("20"));
        // 각 학생의 성적 출력
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + "\t");
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
                sum += scores[i][j];
            }
            int ii = 20;
            String name = "kang";
            double avg = sum / (double)scores[i].length;
            System.out.printf("%d\t%.1f\n%d%s", sum, avg,ii,name);
            System.out.printf("test");
            System.out.printf("%s",name);

            Object[] objArr = new Object[3];
            objArr[0] = 10;
            objArr[1] = "abc";
            objArr[2] = 'c';
        }
    }
}