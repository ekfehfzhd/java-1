//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    String[] title = new String[] {"어서와 JAVA는 처음이지?","쉽게 배우는 자료구조"};
    String[] author = new String[] {"천인국", "문병로"};
    int[] pages = new int[] {230, 330};
    float[] prices = new float[] {23000, 32000};

    for (int i = 0; i < title.length; i++)
        System.out.printf(" %s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f 원\n\n",
                title[i], author[i], pages[i], prices[i]);
}
