//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int radius = 6400; //단위 = km
    final float PI = 3.141592f;
    final int Korea = 100505;  // 단위 = km²

    double surface = 4 * PI * radius * radius;

    double ratio = Korea / surface;

    System.out.printf("지구의 반지름은 %,dkm이고 표면적은 %,.2fkm²이다\n", radius, surface);
    System.out.printf("대한민국 면적은 %,dkm²은 %f %% 입니다\n", Korea, ratio);



}
