import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println("请输入您猜的数字：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int Guess = sc.nextInt();
            if (Guess > number) {
                System.out.println("您猜的数字偏大，请您再猜一次：");
            }else if (Guess < number) {
                System.out.println("您猜的数字偏小，请您再猜一次：");
            }else {
                System.out.println("恭喜您猜对了！！！");
                break;
            }

        }
    }
}
