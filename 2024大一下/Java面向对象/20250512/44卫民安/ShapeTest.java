public class ShapeTest {
    public static void main(String[] args) {
        // 创建图形对象
        Shape square = new Square();
        Shape circle = new Circle();

        // 计算并输出面积
        System.out.println("边长为2的正方形面积: " + square.area(2.0));  // 输出：4.0
        System.out.println("半径为3的圆形面积: " + circle.area(3.0));  // 输出：28.274333882308138
    }
}