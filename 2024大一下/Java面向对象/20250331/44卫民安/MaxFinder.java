package j2;

public class MaxFinder {

	public static void main(String[] args) {

        System.out.println("???????" + findMax(5, 2, 8));    // 8
        System.out.println("???????" + findMax(10, 10, 5));  // 10
        System.out.println("???????" + findMax(-3, -1, -5)); // -1
        System.out.println("???????" + findMax(7, 15, 15));  // 15
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }


}
