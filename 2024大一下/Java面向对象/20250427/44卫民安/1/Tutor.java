// 助教类
public class Tutor extends Teacher {
    public Tutor(String id, String name) {
        super(id, name);
        setWorkType("教研工作 - 辅导");
    }

    @Override
    public void work() {
        System.out.println("助教 " + getId() + " " + getName() + " 正在辅导学生，解答疑问");
    }
}