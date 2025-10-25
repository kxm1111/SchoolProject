// 老师类(子类)
import java.util.Scanner;

public class Teacher extends User {
    private String departmentName; // 部门名称

    public Teacher(String name, int age, String departmentName) {
        super(name, age);
        this.departmentName = departmentName;
    }

    // 发布问题的方法
    public void publishForm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要发布的问题: ");
        String question = scanner.nextLine();
        System.out.println("老师 " + getName() + " 来自部门 " + departmentName + " 发布了问题: " + question);
        scanner.close();
    }

    // Getter 和 Setter 方法
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return super.toString() + ", 部门: " + departmentName;
    }
}