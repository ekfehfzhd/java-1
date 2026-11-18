//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    int[] step1 = {3, 3, 3, 0};
    int[] step2 = {3, 3, 3, 0};
    int[] step3 = {3, 3, 3, 0};
    int[] step4 = {3, 3, 3, 0};
    int[] step5 = {3, 3, 3, 0};

    int[][] villa1 = {step1, step2, step3, step4, step5};
    int[][] villa2 = {step1, step2, step3, step4, step5};
    int[][] villa3 = {step1, step2, step3, step4, step5};
    int[][][] villa = {villa1, villa2, villa3};

    int[][][] somangVilla = new int[][][] {{
                    {3, 3, 3, 0},
                    {3, 3, 3, 0},
                    {3, 3, 3, 0},
                    {3, 3, 3, 0},
                    {3, 3, 3, 0}
            },
            {step1, step2, step3, step4, step5},
            {step1, step2, step3, step4, step5}
    };

    int[][] total = new int[somangVilla.length][villa1.length];
    int[] sum = new int[somangVilla.length];
    int total_of_sum = 0;

    for (int i = 0; i < somangVilla.length; i++) {
        for (int j = 0; j < somangVilla[i].length; j++) {
            for (int k = 0; k < somangVilla[i][j].length; k++) {
                total[i][j] += somangVilla[i][j][k];
            }
        }
    }

    for (int i = 0; i < total.length; i++) {
        for (int j = 0; j < total[i].length; j++)
            sum[i] += total[i][j];
    }

    for (int i = 0; i < sum.length; i++)
        total_of_sum += sum[i];

    for (int i = 0; i < somangVilla.length; i++) {
        System.out.printf("%d동 주민 수\n", i + 1);
        for (int j = 0; j < somangVilla[i].length; j++) {
            System.out.printf("%d 층\n", j + 1);
            for (int k = 0; k < somangVilla[i][j].length - 1; k++) {
                System.out.printf("%d호 ", k + 1);
            }
            System.out.println("합계");
        }
        System.out.println("동별 합계");
    }
    System.out.println("빌라 합계");
}
