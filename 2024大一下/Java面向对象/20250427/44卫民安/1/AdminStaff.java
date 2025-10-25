// 行政部员工类(子类)
public class AdminStaff extends Employee {
    public AdminStaff(String id, String name) {
        super(id, name);
        setWorkType("行政工作");
    }
}