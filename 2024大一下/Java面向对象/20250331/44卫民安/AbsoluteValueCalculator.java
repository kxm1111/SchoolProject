package j2;

public class AbsoluteValueCalculator {
	public static void main(String[] args) {

        System.out.println("-6.6 的绝对值是：" + getAbsoluteValue(-6.6));  // 6.6
        System.out.println("6.6 的绝对值是：" + getAbsoluteValue(6.6));    // 6.6
        System.out.println("-0.0 的绝对值是：" + getAbsoluteValue(-0.0)); // 0.0
        System.out.println("3.14 的绝对值是：" + getAbsoluteValue(3.14));  // 3.14
        System.out.println("-999.99 的绝对值是：" + getAbsoluteValue(-999.99)); // 999.99
    }

    public static double getAbsoluteValue(double num) {
        return num < 0 ? -num : num;
    }
}
