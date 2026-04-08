package day06;

class Test{

}
public class VendingMachine {
    //추상화 - 불필요한 것들은 제거하고 필요한 것만 남기는 과정.
//     어떤 속성이 있지?
//    어떤 기능을 갖고 있지?
//    이 때...   우리는 모두 같은 속성과 행위를 생각했을 까요?
//어떤 목적으로 사용하느냐에 따라서 추상화 된 결과는 달라질 수 있다.

//    고객 - 추상화한다.
//    도서대여점 고객? - 신발사이즈는?
//    신발가게 고객??
//    반찬가게 고객?
//    Test aaa = new Test();
// 필드
    String product;
    int price;

    // 메소드 추가
    public String pushProductButton(int menuId) {
        if(menuId == 1) return "콜라";
        else if(menuId == 2) return "사이다";
        else if(menuId == 3) return "환타";
        else return "없는 상품";
    }

    public static void main(String[] args) {
        // 인스턴스 생성
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        // 메시지 전송(메소드 호출)
        String product = vm1.pushProductButton(1);
        System.out.println("선택한 상품: " + product);

        // 자판기를 5개 만들고 싶다면?
        VendingMachine[] machines = new VendingMachine[5];
        for(int i = 0; i < 5; i++) {
            machines[i] = new VendingMachine();
        }
    }
}
