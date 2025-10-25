// 学生干部类
public class StudentLeader extends Student {
    private String job; // 职务

    // 无参构造
    public StudentLeader() {
    }

    // 有参构造
    public StudentLeader(String name, String gender, int age, String nationality, String school, String stuNumber, String job) {
        super(name, gender, age, nationality, school, stuNumber);
        this.job = job;
    }

    // 增加开会方法
    public void meeting() {
        System.out.println("学生干部 " + name + " 喜欢开会!");
    }
}