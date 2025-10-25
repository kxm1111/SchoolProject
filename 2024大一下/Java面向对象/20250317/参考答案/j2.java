import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      题目1
        System.out.println("请输入第一个整数数字: ");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数数字: ");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数数字: ");
        int c = sc.nextInt();
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("最大值: " + max);

//        题目2
        System.out.println("请输入作为程序员的你的工作的工龄:");
        int gl = sc.nextInt();
        System.out.println("请输入作为程序员的你的基本工资为:");
        int jbgz = sc.nextInt();
        int yzgz;
        if (gl >= 10 && gl < 15) {
            yzgz = 20000;
        } else if (gl >= 5 && gl < 10) {
            yzgz = 10000;
        } else if (gl >= 3 && gl < 5) {
            yzgz = 5000;
        } else if (gl >= 1 && gl < 3) {
            yzgz = 3000;
        } else {
            yzgz = 0;
        }
        System.out.println("您目前工作了" + gl + "年，基本工资为 "
                + jbgz + "元, 应涨工资 " + yzgz + "元,涨后工资 " + (jbgz + yzgz) +
                "元");

//      题目3:
        int sum = 0;
        for (int num = 1; num <= 100; num++) {
            if ((num % 3 == 0) && (num % 5 == 0)) {
                System.out.println(num);
                sum += num;
            }
        }
        System.out.println("以上满足条件的数字之和: " + sum);

//        题目4:
        System.out.println("请输入大于100的三位整数数字: ");
        int maxValue = sc.nextInt();
        int c1 = 0;
        int s1 = 0;
        for (int n = 100; n <= maxValue; n++) {
            int ge = n % 10;
            int shi = n / 10 % 10;
            int bai = n / 100 % 10;
            if ((ge != 7) && (shi != 5) && (bai != 3)) {
                System.out.println(n);
                s1 += n;
                c1++;
            }
        }
        System.out.println("以上满足条件的数字之和: " + s1);
        System.out.println("以上满足条件的数字个数: " + c1);

//        题目5:
        int co = 0;
        for (int num = 1000; num <= 9999; num++) {
            int ge = num % 10;
            int shi = num / 10 % 10;
            int bai = num / 100 % 10;
            int qian = num / 1000 % 10;
            if ((ge + qian) == (bai + shi)) {
                System.out.print(num + " ");
                co++;
                if (co % 5 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("以上满足条件的数字个数: " + co);


}
}