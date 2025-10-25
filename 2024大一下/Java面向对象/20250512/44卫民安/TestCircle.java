public class TestCircle {
    public static void main(String[] args) {
        // 创建两个圆对象
        circleClass circle1 = new circleClass(3.5);
        circleClass circle2 = new circleClass(5.0);

        // 显示面积
        System.out.println("圆1（半径3.5）的测试：");
        circle1.displayArea();

        System.out.println("\n圆2（半径5.0）的测试：");
        circle2.displayArea();
    }
}