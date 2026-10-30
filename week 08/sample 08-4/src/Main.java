//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int score;

    System.out.print("점수를 입력하세요: ");
    score = keyboard.nextInt();


    boolean result = (score >= 80 && score < 90) || score == 100;
    System.out.printf("조건 만족 여부: %b", result);
}

