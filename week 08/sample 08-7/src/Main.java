//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int days;

    System.out.print("시간 입력 : ");
    double time = keyboard.nextDouble();

    days = (int) time / 24;
    double hours2 = time - (days * 24);

    int hours = (int) hours2;
    double minutes2 = (hours2 - hours) * 60;

    int minutes = (int) minutes2;

    int seconds = (int) ((minutes2 - minutes) * 60);


    System.out.printf("%.2f 시간은 %d 일 %d 시간 %d 분 %d 초 입니다%n", time, days, hours, minutes, seconds);
}
