//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    class Customer {
        String waterNo;
        String name;
        char type;
        String typeName;
        float usage;
        int charge;
        int tax;
        int pay;

        public Customer(String waterNo, String name, char type) {
            this.waterNo = waterNo;
            this.name = name;
            this.type = type;
        }

        public Customer(String waterNo, String name, char type, float usage) {
            this.waterNo = waterNo;
            this.name = name;
            this.type = type;
            this.typeName = typeName;
            this.usage = usage;
        }
    }

    Customer[] customers = new Customer[] {
            new Customer("1111", "홍길동", '1', 135.7f),
            new Customer("1211", "이대한", '3', 789.6f),
            new Customer("1311", "한길사", '4', 2345.6f),
            new Customer("1411", "한민국", '2', 3456.7f),
            new Customer("1511", "정동진", '5', 124.6f),
            new Customer("1611", "이순신", '5', 789.6f),
            new Customer("1711", "세정기", '2', 345.6f),
            new Customer("1811", "구자돌", '3', 678.9f),
            new Customer("1911", "이해선", '4', 345.3f),
            new Customer("2111", "장미자", '1', 789.5f)};

    int count = 0;
    while (count < customers.length) {
        System.out.printf("%s 고객님의 사용량 입력(예 12.5) : ", customers[count].name);
        customers[count].usage = keyboard.nextFloat();
        if (customers[count].usage >= 0.0f)
            count++;
        else {
            System.err.println("ERROR : 사용량은 0 ~ ");
            System.in.read();
        }
    }


    for (int i = 0; i < customers.length; i++) {
        if (customers[i].type == '1')
            customers[i].typeName = "가정용";
        else if (customers[i].type == '2')
            customers[i].typeName = "영업용";
        else if (customers[i].type == '3')
            customers[i].typeName = "공장용";
        else if (customers[i].type == '4')
            customers[i].typeName = "광공서";
        else if (customers[i].type == '5')
            customers[i].typeName = "군기관";
        else
            customers[i].typeName = "";
    }

    for (int i = 0; i < customers.length; i++) {
        customers[i].charge = 1200;
        int usage = (int)(customers[i].usage + 0.5f);

        switch (customers[i].type) {
            case '1' :
                customers[i].charge += usage * 40;
                break;
            case '2' :
                customers[i].charge += usage * 55;
                break;
            case '3' :
                customers[i].charge += usage * 78;
                break;
            case '4' :
                customers[i].charge += usage * 35;
                break;
            case '5' :
                customers[i].charge += usage * 20;
                break;
            default:
                customers[i].charge = 0;
        }
    }

    for (int i = 0; i < customers.length; i++) {
        if (customers[i].type == '1') {
            customers[i].tax = (int) (customers[i].charge * 5.0f / 100);
        } else if (customers[i].type == '2') {
            customers[i].tax = (int) (customers[i].charge * 3.5f / 100);
        } else if (customers[i].type == '3') {
            customers[i].tax = (int) (customers[i].charge * 2.5f / 100);
        } else if (customers[i].type == '4') {
            customers[i].tax = (int) (customers[i].charge * 1.5f / 100);
        } else if (customers[i].type == '5') {
            customers[i].tax = (int) (customers[i].charge * 0.0f);
        } else {
            customers[i].tax = -1;
        }
        customers[i].tax = customers[i].tax / 10 * 10;

    }
    for (int i = 0; i < customers.length; i++){
        customers[i].pay = customers[i].charge + customers[i].tax;
    }


    System.out.println("**************************************************");
    System.out.println("번호   이름     구분       사용량     사용금액       세금      납부금액    기타");
    System.out.println("**************************************************");

    for (int i = 0; i < customers.length; i++) {
        System.out.printf(" %4s %3s %3c %3s %,7.1f %,10d원 %,7d원 %,10d원 %s\n",
                customers[i].waterNo, customers[i].name, customers[i].type, customers[i].typeName, customers[i].usage,
                customers[i].charge, customers[i].tax, customers[i].pay,
                customers[i].type == '5' ? "일괄 징수" : "");}

    System.out.println("**************************************************");
}
