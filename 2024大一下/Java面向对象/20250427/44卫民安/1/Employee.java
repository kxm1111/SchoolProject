// 员工类(父类)
public class Employee {
    private String id; // 员工编号
    private String name; // 员工姓名
    private String workType; // 负责的工作类型

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // 工作方法(抽象方法)
    public void work() {
        System.out.println("员工 " + id + " " + name + " 正在工作");
    }

    // Getter 和 Setter 方法
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    @Override
    public String toString() {
        return "员工编号: " + id + ", 姓名: " + name + ", 工作类型: " + workType;
    }
}