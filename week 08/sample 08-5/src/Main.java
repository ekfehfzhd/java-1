//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int age;
    int score;

    System.out.print("나이를 입력하세요: ");
    age = keyboard.nextInt();
    System.out.print("점수를 입력하세요: ");
    score = keyboard.nextInt();



    String result = (age >= 18 && score >= 80) ? "합격" : ((age < 18 || score < 50) ? "불합격" : "재시험");
    System.out.printf("시험 결과: %s", result);
}
