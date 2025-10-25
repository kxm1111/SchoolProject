// 员工类（父类）
public class Employee {
    private String name; // 姓名
    private String id; // 工号
    private double salary; // 工资

    // 无参构造
    public Employee() {
    }

    // 有参构造
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // 工作方法
    public void work() {
        System.out.println(name + " 正在工作");
    }

    // Getter 和 Setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "姓名: " + name + ", 工号: " + id + ", 工资: " + salary;
    }
}