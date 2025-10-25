// 学生类
public class Student extends Person {
    private String school; // 学校
    private String stuNumber; // 学号

    // 无参构造
    public Student() {
    }

    // 有参构造
    public Student(String name, String gender, int age, String nationality, String school, String stuNumber) {
        super(name, gender, age, nationality);
        this.school = school;
        this.stuNumber = stuNumber;
    }

    // 重写工作方法
    @Override
    public void work() {
        System.out.println("学生 " + name + " 的工作是学习!");
    }
}