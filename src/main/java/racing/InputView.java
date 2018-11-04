package racing;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {
        throw new IllegalStateException("Utility class");
    }

    public static int getNum() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return SCANNER.nextInt();

    }

    public static int getTime() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        return SCANNER.nextInt();
    }
}
