// 程序员类（子类）
public class Programmer extends Employee {
    // 无参构造
    public Programmer() {
    }

    // 有参构造
    public Programmer(String name, String id, double salary) {
        super(name, id, salary);
    }

    // 重写工作方法
    @Override
    public void work() {
        System.out.println(getName() + " 正在编写代码，实现项目功能");
    }
}