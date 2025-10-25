// 主类
public class TliasSystem {
    public static void main(String[] args) {
        // 创建学生对象
        Student student = new Student("张三", 20, "Java班");
        System.out.println(student);
        student.viewSchedule(); // 学生查看课表
        student.fillForm();     // 学生填写听课反馈

        System.out.println();

        // 创建老师对象
        Teacher2 teacher = new Teacher2("李四", 35, "计算机科学部");
        System.out.println(teacher);
        teacher.viewSchedule(); // 老师查看课表
        teacher.publishForm();  // 老师发布问题
    }
}