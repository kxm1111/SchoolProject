// 测试类
public class TestPerson {
    public static void main(String[] args) {
        // 创建学生对象并调用方法
        Student student = new Student("张三", "男", 20, "中国", "传智教育", "202312345");
        student.work(); // 输出: 学生 张三 的工作是学习!

        // 创建工人对象并调用方法
        Worker worker = new Worker("李四", "男", 30, "中国", "建筑公司", 10);
        worker.work(); // 输出: 工人 李四 的工作是盖房子!

        // 创建学生干部对象并调用方法
        StudentLeader studentLeader = new StudentLeader("王五", "男", 22, "中国", "传智教育", "202354321", "班长");
        studentLeader.meeting(); // 输出: 学生干部 王五 喜欢开会!
    }
}