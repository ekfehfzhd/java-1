//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int age;
    int salary;
    boolean debt;

    System.out.print("나이를 입력하세요: ");
    age = keyboard.nextInt();

    System.out.print("연봉을 입력하세요(단위:만) : ");
    salary = keyboard.nextInt();

    System.out.print("빚이 있습니까? (있으면 true, 없으면 false): ");
    debt = keyboard.nextBoolean();


    boolean result = age >= 25 && age < 40 && salary >= 5000 && debt;


    System.out.printf("조건 만족 여부: %b", result);
}
