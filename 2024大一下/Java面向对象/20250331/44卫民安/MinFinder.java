package j2;

public class MinFinder {

	public static void main(String[] args) {

        System.out.println("较小的数是：" + findMin(3.5, 4.2));   // 3.5
        System.out.println("较小的数是：" + findMin(5.0, 5.0));   // 5.0
        System.out.println("较小的数是：" + findMin(-2.1, -3.5)); // -3.5
        System.out.println("较小的数是：" + findMin(10.0, 2.5));  // 2.5
    }

    public static double findMin(double a, double b) {
        return Math.min(a, b);

    }
}
