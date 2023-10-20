import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueAndLinkedList {
    static Scanner scanner = new Scanner(System.in);
    static Queue<String> queue = new LinkedList<>();

    static {
        queue.add("a");
        queue.add("b");
        queue.add("c");
    }

    static String input;

    public static void handleDisplay() {
        for (String que : queue) {
            System.out.println(queue.toString());
            break;
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-3-MENU***************");
            System.out.println("1. Nhập tên phụ huynh nộp hồ sơ ");
            System.out.println("2. Phụ huynh tiếp theo ");
            System.out.println("3. Thoát ");
            System.out.println("Mời nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            handleChoice(choice);
        }
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                handleDisplay();
                System.out.println("Nhập tên phụ huynh mới: ");
                input = scanner.nextLine();
                queue.add(input);
                System.out.println("Danh sách sau khi thêm mới là: ");
                handleDisplay();
                break;
            case 2:
                System.out.println("phụ huynh đầu tiên trong danh sách là: " + queue.poll());
                System.out.println("Danh sách sau khi xóa phụ huynh đầu tiên là: ");
                handleDisplay();
                break;
            case 3:
                System.exit(0);
                break;

        }
    }
}
