// 工人类
public class Worker extends Person {
    private String unit; // 单位
    private int workAge; // 工龄

    // 无参构造
    public Worker() {
    }

    // 有参构造
    public Worker(String name, String gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    // 重写工作方法
    @Override
    public void work() {
        System.out.println("工人 " + name + " 的工作是盖房子!");
    }
}