// 讲师类
public class Lecturer extends Teacher {
    public Lecturer(String id, String name) {
        super(id, name);
        setWorkType("教研工作 - 授课");
    }

    @Override
    public void work() {
        System.out.println("讲师 " + getId() + " " + getName() + " 正在授课，教授专业课程");
    }
}