import java.util.Scanner;


void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1;
    int num2;

    System.out.print("첫 번째 수를 입력 (분자) : ");
    num1 = keyboard.nextInt();
    System.out.print("두 번째 수를 입력 (분모) : ");
    num2 = keyboard.nextInt();



    System.out.printf("%d를 %d로 나누면 몫 = %d, 나머지 = %d 이다.\n", num1, num2, num1 / num2, num1 % num2);
    System.out.printf("%d를 %d로 나누면 = %.1f 이다.\n", num1, num2, (float) num1 / num2);
}