//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int cost;
    double profitrate;

    System.out.print("매입원가를 입력하세요: ");
    cost = keyboard.nextInt();
    System.out.print("이익율을 입력하세요: ");
    profitrate = keyboard.nextDouble() / 100.0;


    int sales = (int) (cost * (1 + profitrate));
    int salesTax = (int) (sales * 0.10);
    int purchaseTax = (int) (cost * 0.10);
    int taxToPay = salesTax - purchaseTax;

    System.out.printf("정가 (매출액) : %,d 원%n", sales);
    System.out.printf("매출 세액 (10%%): %,d 원%n", salesTax);
    System.out.printf("매입 세액 (10%%): %,d 원%n", purchaseTax);
    System.out.printf("납부 세액      : %,d 원%n", taxToPay);
}

