public class TestEmployee {
    public static void main(String[] args) {
        // 创建项目经理对象并赋值
        Manager manager = new Manager("张三", 123, 15000, 6000);
        // 调用项目经理的工作方法
        manager.work();

        // 创建程序员对象并赋值
        Coder coder = new Coder("李四", 135, 10000);
        // 调用程序员的工作方法
        coder.work();
    }
}