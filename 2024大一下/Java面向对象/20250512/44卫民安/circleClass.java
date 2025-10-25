// 实现接口的类
public class circleClass implements circleInterface {
    private double radius;

    // 构造函数初始化半径
    public circleClass(double r) {
        this.radius = r;
    }

    // 实现接口的抽象方法
    @Override
    public void circleArea() {
        double area = PI * radius * radius;
        System.out.println("计算完成，圆面积为：" + area);
    }

    // 新增的显示面积方法
    public void displayArea() {
        circleArea(); // 调用接口方法计算结果
    }
}