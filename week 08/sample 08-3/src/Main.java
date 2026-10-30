//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int age;
    int license;
    boolean drunk;

    System.out.print("나이를 입력하세요: ");
    age = keyboard.nextInt();

    System.out.print("면허 취득 후 경과 년수를 입력하세요 (1년 미만이면 0): ");
    license = keyboard.nextInt();

    System.out.print("음주운전 전적이 있습니까? (있으면 true, 없으면 false): ");
    drunk = keyboard.nextBoolean();


    boolean result = age >= 21 && license >= 1 && !drunk;

    System.out.printf("렌트 가능 여부: %b", result);
}
