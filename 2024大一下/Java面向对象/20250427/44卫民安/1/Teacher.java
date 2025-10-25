// 教研部员工类(子类)
public class Teacher extends Employee {
    public Teacher(String id, String name) {
        super(id, name);
        setWorkType("教研工作");
    }
}