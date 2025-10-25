public class Coder {
    // 私有属性
    private String name; // 姓名
    private int id; // 工号
    private double salary; // 工资

    // 空参构造方法
    public Coder() {
    }

    // 带参数的构造方法
    public Coder(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
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

    // 工作方法
    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "的程序员" + name + "正在努力的写着代码......");
    }
}