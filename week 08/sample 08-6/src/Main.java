//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int age;
    String fee;

    System.out.print("나이를 입력하세요: ");
    age = keyboard.nextInt();

    fee = (age >= 18) ? "4,000원" : (age >= 13) ? "3,000원" : (age >= 7) ? "1,000원" : "무료";

    System.out.printf("나이: %d세 / 체육관 입장료: %s%n", age, fee);
}



