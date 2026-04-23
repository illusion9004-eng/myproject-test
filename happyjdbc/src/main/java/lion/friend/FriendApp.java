package lion.friend;

import lion.friend.dto.FriendDTO;
import lion.friend.service.FriendService;

import java.util.List;
import java.util.Scanner;

public class FriendApp {

    private static final FriendService friendService = new FriendService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            printMenu();
            System.out.print("선택 > ");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1":
                    addFriend(scanner);
                    break;
                case "2":
                    getFriend(scanner);
                    break;
                case "3":
                    getAllFriends();
                    break;
                case "4":
                    modifyFriend(scanner);
                    break;
                case "5":
                    removeFriend(scanner);
                    break;
                case "0":
                    run = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴입니다.");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("=================================");
        System.out.println("1. 친구 등록");
        System.out.println("2. 친구 조회");
        System.out.println("3. 친구 전체 조회");
        System.out.println("4. 친구 수정");
        System.out.println("5. 친구 삭제");
        System.out.println("0. 종료");
        System.out.println("=================================");
    }

    private static void addFriend(Scanner scanner) {
        System.out.print("이름 입력 > ");
        String name = scanner.nextLine();

        System.out.print("전화번호 입력 > ");
        String phone = scanner.nextLine();

        System.out.print("이메일 입력 > ");
        String email = scanner.nextLine();

        boolean result = friendService.addFriend(name, phone, email);

        if (result) {
            System.out.println("친구가 등록되었습니다.");
        } else {
            System.out.println("친구 등록에 실패했습니다.");
        }
    }

    private static void getFriend(Scanner scanner) {
        System.out.print("조회할 번호 입력 > ");
        long id = Long.parseLong(scanner.nextLine());

        FriendDTO friendDTO = friendService.getFriend(id);

        if (friendDTO == null) {
            System.out.println("해당 친구가 없습니다.");
            return;
        }

        printFriend(friendDTO);
    }

    private static void getAllFriends() {
        List<FriendDTO> list = friendService.getAllFriends();

        if (list.isEmpty()) {
            System.out.println("등록된 친구가 없습니다.");
            return;
        }

        for (FriendDTO friendDTO : list) {
            printFriend(friendDTO);
            System.out.println("------------------------------");
        }
    }

    private static void modifyFriend(Scanner scanner) {
        System.out.print("수정할 번호 입력 > ");
        long id = Long.parseLong(scanner.nextLine());

        System.out.print("이름 입력 > ");
        String name = scanner.nextLine();

        System.out.print("전화번호 입력 > ");
        String phone = scanner.nextLine();

        System.out.print("이메일 입력 > ");
        String email = scanner.nextLine();

        boolean result = friendService.modifyFriend(id, name, phone, email);

        if (result) {
            System.out.println("친구 정보가 수정되었습니다.");
        } else {
            System.out.println("친구 정보 수정에 실패했습니다.");
        }
    }

    private static void removeFriend(Scanner scanner) {
        System.out.print("삭제할 번호 입력 > ");
        long id = Long.parseLong(scanner.nextLine());

        boolean result = friendService.removeFriend(id);

        if (result) {
            System.out.println("친구 정보가 삭제되었습니다.");
        } else {
            System.out.println("친구 정보 삭제에 실패했습니다.");
        }
    }

    private static void printFriend(FriendDTO friendDTO) {
        System.out.println("번호      > " + friendDTO.getId());
        System.out.println("이름      > " + friendDTO.getName());
        System.out.println("전화번호  > " + friendDTO.getPhone());
        System.out.println("이메일    > " + friendDTO.getEmail());
    }
}
