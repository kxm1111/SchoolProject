// 测试类
public class EmployeeTest {
    public static void main(String[] args) {
        // 创建项目经理对象并调用方法
        ProjectManager pm = new ProjectManager("张三", "PM001", 15000, 5000);
        System.out.println(pm);
        pm.work();

        System.out.println(); // 空行分隔

        // 创建程序员对象并调用方法
        Programmer pg = new Programmer("李四", "PG001", 12000);
        System.out.println(pg);
        pg.work();
    }
}