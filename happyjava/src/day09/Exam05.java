package day09;
enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum OrderStatus {
    PENDING("P", "대기중"),
    PROCESSING("R", "처리중"),
    SHIPPED("S", "배송중"),
    DELIVERED("D", "배송완료"),
    CANCELLED("C", "취소");

    private final String code;
    private final String description;

    // 생성자
    OrderStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }

    // getter 메소드
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    // 정적 메소드
    public static OrderStatus fromCode(String code) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.code.equals(code)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }
}

public class Exam05 {
    public static void main(String[] args) {
        //요일을 저장하고 싶다.
        String day;

        day = "월요일";
        day = "화요일";

        day = "test";
        day = "kang";

        Day today = Day.MONDAY;
        today = Day.SATURDAY;

        //열거형을 사용함으로서 잘못된 값이 들어가지 않게 될거예요.


    }
}
