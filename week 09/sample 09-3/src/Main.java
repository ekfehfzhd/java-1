//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        final int START = 1;
        final int END = 100;
        int total = 0;
        int first, last;
        String result;
        char answer;

        // 1~100 기본 합계 구하기
        for (int i = START; i <= END; i++) {
            total += i; // i를 더하도록 수정
        }
        System.out.printf("%d + %d + .... + %d + %d = %,d\n",
                START, START + 1, END - 1, END, total);

        while (true) {
            total = 0; // 누적 합 초기화

            while (true) {
                System.out.print("어디부터 시작할까요? ");
                first = keyboard.nextInt();
                System.out.print("어디까지 더할까요? ");
                last = keyboard.nextInt();

                if (first <= last) {
                    break;
                } else {
                    System.err.printf("ERROR : 시작 값(%d)이 종료값(%d)보다 작거나 같아야 함\n", first, last);
                }
            }

            // first부터 last까지의 합 계산
            for (int i = first; i <= last; i++) { // first ~ last 범위 지정
                total += i; // i를 더하도록 수정
            }

            int count = last - first + 1; // 입력된 숫자의 개수

            if (count >= 5) {
                result = String.format("%d + %d + .... + %d + %d = %,d",
                        first, first + 1, last - 1, last, total);
            } else if (count == 1) {
                result = String.format("%d = %,d", first, total);
            } else if (count == 2) {
                result = String.format("%d + %d = %,d", first, last, total);
            } else if (count == 3) {
                result = String.format("%d + %d + %d = %,d", first, first + 1, last, total);
            } else { // count == 4
                result = String.format("%d + %d + %d + %d = %,d", first, first + 1, last - 1, last, total);
            }

            System.out.println(result);

            // 계속 여부 확인
            while (true) {
                System.out.print("계속할까요? (yes/no) ");
                keyboard.nextLine(); // nextInt() 후 남아있는 개행 문자 소비
                String input = keyboard.nextLine().trim();

                if (!input.isEmpty()) {
                    answer = input.charAt(0);
                    if (answer == 'Y' || answer == 'y' || answer == 'N' || answer == 'n')
                        break;
                }
                System.err.println("ERROR : 입력 오류 (Y/N 중 입력)");
            }

            if (answer == 'n' || answer == 'N')
                break;
        }
    }
}
