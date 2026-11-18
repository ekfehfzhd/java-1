//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);

    final int id = 0;
    final int name = 1;
    final int base = 0;
    final int sudang = 1;
    final int pay = 2;
    final int tax = 3;
    final int net = 4;

    String[][] employees = new String[][]{
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}
    };
    char[] grade = new char[] {'1', '2', '3', '4', '5', '1', '2', '3', '4', '5'};
    int[][] salary = {
            {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0},
            {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0},
            {0, 800000, 0, 0, 0}, {0, 800000, 0, 0, 0}
    };

    int[] unit = {0, 1650000, 1680000, 1700000, 1720000, 1750000};
    int[] taxrate = {1600000, 2300000}; // 세미콜론 추가

    for (int i = 0; i < employees.length; i++) {
        salary[i][base] = unit[grade[i] - '0'];
    }

    /* int count = 0;
    while (count < employees.length){
        System.out.printf("%s 사원의 수당 입력 : ", employees[count][name]);
        salary[count][sudang] = keyboard.nextInt();

        if (salary[count][sudang] >= 0 && salary[count][sudang] <= 1000000)
            count++;
        else{
            System.err.print("ERROR : 0~1000000");
            System.in.read();
        }
    } */

    for (int i = 0; i < employees.length; i++) {
        salary[i][pay] = salary[i][base] + salary[i][sudang];
    }

    for (int i = 0; i < employees.length; i++) {
        int temp = salary[i][pay] - (int) (salary[i][pay] * 15.0f / 100);
        if (temp < taxrate[0]) {
            salary[i][tax] = (int) (temp * 3.3f / 100);
        } else if (temp < taxrate[1]) {
            salary[i][tax] = (int) (temp * 7.5f / 100);
        } else {
            salary[i][tax] = (int) (temp * 10.2f / 100);
        }
        salary[i][tax] = salary[i][tax] / 100 * 100;
    }

    for (int i = 0; i < employees.length; i++) {
        salary[i][net] = salary[i][pay] - salary[i][tax];
    }


    for (int i = 0; i < employees.length - 1; i++) {
        for (int j = 0; j < employees.length - (i + 1); j++) {
            if (salary[j][net] > salary[j + 1][net]) {
                String[] temp = employees[i];
                employees[i] = employees[j + 1];
                employees[j + 1] = temp;

                char test = grade[i];
                grade[i] = grade[j + 1];
                grade[j + 1] = test;

                int[] test1 = salary[i];
                salary[i] = salary[j + 1];
                salary[j + 1] = test1;
            }
        }
    }

    for (int i = 0; i < employees.length; i++) {
        System.out.printf("%3s %4s %c %,10d %,10d %,10d %,9d %,10d\n",
                employees[i][name], employees[i][id], grade[i],
                salary[i][base], salary[i][sudang], salary[i][pay],
                salary[i][tax], salary[i][net]);
    }
}
