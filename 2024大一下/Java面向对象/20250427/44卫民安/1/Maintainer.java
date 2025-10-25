// 维护专员类
public class Maintainer extends AdminStaff {
    public Maintainer(String id, String name) {
        super(id, name);
        setWorkType("行政工作 - 设备维护");
    }

    @Override
    public void work() {
        System.out.println("维护专员 " + getId() + " " + getName() + " 正在维护公司设备和设施");
    }
}