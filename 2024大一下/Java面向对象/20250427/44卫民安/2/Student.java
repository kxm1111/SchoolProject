// 学生类(子类)
import java.util.Scanner;

public class Student extends User {
    private String className; // 所在班级

    public Student(String name, int age, String className) {
        super(name, age);
        this.className = className;
    }

    // 填写听课反馈的方法
    public void fillForm() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入听课反馈: ");
        String feedback = scanner.nextLine();
        System.out.println("学生 " + getName() + " 来自班级 " + className + " 提交了听课反馈: " + feedback);
        scanner.close();
    }

    // Getter 和 Setter 方法
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return super.toString() + ", 班级: " + className;
    }
}