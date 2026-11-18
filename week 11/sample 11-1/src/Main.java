//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {

    int[] students1 = new int[] {41, 43, 45, 42, 44, 39};
    int[] students2 = new int[] {41, 43, 45, 42, 44, 39};
    int[] students3 = new int[] {41, 43, 45, 42, 44, 39};
    int[][] students = new int[][]{students1,students2,students3};



    int[][] highschoolStudent = {
            {41, 43, 45, 42, 44, 39, 0},
            {41, 43, 45, 42, 44, 39, 0},
            {41, 43, 45, 42, 44, 39, 0}
    };

    int[] total = new int[highschoolStudent.length];
    int sum = 0;

    for (int i = 0; i < highschoolStudent.length; i++) {
        for (int j = 0; j < highschoolStudent[i].length - 1; j++) {
            highschoolStudent[i][6] += highschoolStudent[i][j];
            total[i] += highschoolStudent[i][j];
        }
    }

    for (int i = 0; i < total.length; i++) {
        sum += total[i];
    }

    for (int i = 0; i < highschoolStudent.length; i++) {
        System.out.printf("%d학년 %3d %3d %3d %3d %3d %3d %3d\n", i + 1,
                highschoolStudent[i][0], highschoolStudent[i][1], highschoolStudent[i][2],
                highschoolStudent[i][3], highschoolStudent[i][4], highschoolStudent[i][5], highschoolStudent[i][6]);
    }
    System.out.printf("\t\t\t\t\t\t 학교 정원 : %,d 명\n", sum);
}
