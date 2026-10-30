//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int attend;
    int report;
    boolean cheat;

    System.out.print("출석률을 입력하세요(%): ");
    attend = keyboard.nextInt();

    System.out.print("과제 제출율을 입력하세요(%): ");
    report = keyboard.nextInt();

    System.out.print("부정행위 기록이 있나요? (있으면 true, 없으면 false): ");
    cheat = keyboard.nextBoolean();


    boolean result = attend >= 80 && report >= 70 && !cheat;

    System.out.printf("시험 응시 여부: %b", result);
}
