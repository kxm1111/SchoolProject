public class Manager {
    // 私有属性
    private String name; // 姓名
    private int id; // 工号
    private double salary; // 工资
    private double bonus; // 奖金

    // 空参构造方法
    public Manager() {
    }

    // 带参数的构造方法
    public Manager(String name, int id, double salary, double bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    // 提供set和get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // 工作方法
    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "奖金为" + bonus + "的项目经理" + name +
                "正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}