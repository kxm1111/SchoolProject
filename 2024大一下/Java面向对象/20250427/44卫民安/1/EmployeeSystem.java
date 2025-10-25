// 主类
public class EmployeeSystem {
    public static void main(String[] args) {
        // 创建不同类型的员工
        Lecturer lecturer = new Lecturer("L1001", "张教授");
        Tutor tutor = new Tutor("T1001", "李助教");
        Maintainer maintainer = new Maintainer("M1001", "王维护");
        Buyer buyer = new Buyer("B1001", "刘采购");

        // 显示员工信息
        System.out.println(lecturer);
        System.out.println(tutor);
        System.out.println(maintainer);
        System.out.println(buyer);

        // 员工工作演示
        System.out.println("\n员工工作演示:");
        lecturer.work();
        tutor.work();
        maintainer.work();
        buyer.work();
    }
}