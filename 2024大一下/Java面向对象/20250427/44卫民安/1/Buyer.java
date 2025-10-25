// 采购专员类
public class Buyer extends AdminStaff {
    public Buyer(String id, String name) {
        super(id, name);
        setWorkType("行政工作 - 物资采购");
    }

    @Override
    public void work() {
        System.out.println("采购专员 " + getId() + " " + getName() + " 正在采购办公用品和教学设备");
    }
}