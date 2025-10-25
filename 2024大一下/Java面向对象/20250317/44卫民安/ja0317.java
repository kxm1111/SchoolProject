import java.util.Scanner;

public class ja0317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//      题目1
        System.out.print("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.print("请输入第三个整数：");
        int num3 = sc.nextInt();
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("三个数中的最大值是：" + max);




//        题目2
        System.out.print("请输入作为程序员的你的工作的工龄: ");
        int years = sc.nextInt();
        System.out.print("请输入作为程序员的你的基本工资为: ");
        int baseSalary = sc.nextInt();
        int raise = 0;
        if (years >= 10 && years < 15) {
            raise = 20000;
        } else if (years >= 5 && years < 10) {
            raise = 10000;
        } else if (years >= 3 && years < 5) {
            raise = 5000;
        } else if (years >= 1 && years < 3) {
            raise = 3000;
        } else {
            System.out.println("您的工龄不符合涨工资的条件。");
            return;
        }
        int newSalary = baseSalary + raise;
        System.out.println("您目前工作了" + years + "年，基本工资为 " + baseSalary + "元, 应涨工资 " + raise + "元, 涨后工资 " + newSalary + "元");



//        题目3
        int sum = 0;
        System.out.println("1到100之间既是3的倍数又是5的倍数的数字有：");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\n这些数字的和是：" + sum);


//        题目4
        System.out.print("请输入第一个整数：");
        int n1 = sc.nextInt();
        System.out.print("请输入第二个整数：");
        int n2 = sc.nextInt();
        System.out.print("请输入第三个整数：");
        int n3 = sc.nextInt();
        int m = num1;
        if (n2 > max) {
            m = n2;
        }
        if (n3 > m) {
            m = n3;
        }
        System.out.println("三个数中的最大值是：" + m);

//        题目5
        int count = 0;
        for (int num = 1000; num <= 9999; num++) {
            int ge = num % 10;
            int shi = (num / 10) % 10;
            int bai = (num / 100) % 10;
            int qian = num / 1000;
            if (ge + qian == bai + shi) {
                System.out.println(num);
                count++;
            }
        }
        System.out.println("以上满足条件的四位数总共有 " + count + " 个");






}
}
