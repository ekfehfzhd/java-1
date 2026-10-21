//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final double Don = 3.75f;
    final int Gold = 775000;
    float weight;

    System.out.print("당신의 몸무게는? ");
    weight = keyboard.nextFloat();

    /*int weight1 = (int)weight;
    float remainder = weight - weight1;

    int gram = (int) (weight1 * 1000 + remainder * 1000);*/

    int gram = (int) (weight * 1000);
    double donofweight = gram / Don;
    double money = donofweight * Gold;

    System.out.printf("%.1fkg = %,dgram\n", weight, gram);
    System.out.printf("%.1fkg = %,.2f돈\n", weight, donofweight);
    System.out.printf("%.1fkg = %,.0f원(금 1돈 가격 = %,d원)\n", weight, money, Gold);
}
