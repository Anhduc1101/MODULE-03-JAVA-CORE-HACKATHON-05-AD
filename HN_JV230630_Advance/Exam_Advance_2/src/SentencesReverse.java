import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SentencesReverse {
    static Scanner scanner = new Scanner(System.in);
    static Stack<String> stack = new Stack<>();
    static String input;

    public static void main(String[] args) {
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập câu");
            System.out.println("2. Đảo ngược");
            System.out.println("3. Thoát");
            System.out.println("Mời lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            handleChoice(choice);
        }
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:

                System.out.println("Nhập 1 câu: ");
                input = scanner.nextLine();
                System.out.println(input);
                break;
            case 2:
//                stack = (Stack<String>) Arrays.asList(input.split(" "));
                stack.addAll(Arrays.asList(input.split(" ")));
                System.out.println("Câu sau khi bị đảo ngược là: ");
                for (int i = stack.size()-1; i >=0 ; i--) {
                    System.out.print(stack.get(i) + " ");
                }
                System.out.println();
                break;
            case 3:
                System.out.println("Cảm ơn đã sử dụng chương trình !");
                break;
            default:
                System.out.println("Không có lựa chọn này");
                break;

        }
    }
}
