// 项目经理类（子类）
public class ProjectManager extends Employee {
    private double bonus; // 奖金

    // 无参构造
    public ProjectManager() {
    }

    // 有参构造
    public ProjectManager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    // 重写工作方法
    @Override
    public void work() {
        System.out.println(getName() + " 正在管理项目，制定计划和分配任务");
    }

    // Getter 和 Setter 方法
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", 奖金: " + bonus;
    }
}