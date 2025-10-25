public class CompanyDemo {
    public static void main(String[] args) {
        Employee[] employees = {
                new Lecturer("E001", "张老师"),
                new Tutor("E002", "李助教"),
                new Maintainer("E003", "王维护员"),
                new Buyer("E004", "赵采购员")
        };

        for (Employee emp : employees) {
            emp.work(); // 根据实际对象类型调用对应方法
        }
    }
}

public abstract class Employee {
    private String id;
    private String name;
    private String workDuty;

    public Employee(String id, String name, String workDuty) {
        this.id = id;
        this.name = name;
        this.workDuty = workDuty;
    }

    public abstract void work();

    // Getter/Setter方法省略
}



public class Teacher extends Employee {
    public Teacher(String id, String name, String workDuty) {
        super(id, name, workDuty);
    }

    @Override
    public void work() {
        System.out.println("教研部员工[" + getName() + "]正在" + getWorkDuty());
    }
}

// 讲师类
public class Lecturer extends Teacher {
    public Lecturer(String id, String name) {
        super(id, name, "授课");
    }
}

// 助教类
public class Tutor extends Teacher {
    public Tutor(String id, String name) {
        super(id, name, "辅导学生");
    }
}
public class AdminStaff extends Employee {
    public AdminStaff(String id, String name, String workDuty) {
        super(id, name, workDuty);
    }

    @Override
    public void work() {
        System.out.println("行政部员工[" + getName() + "]正在" + getWorkDuty());
    }
}

// 维护专员类
public class Maintainer extends AdminStaff {
    public Maintainer(String id, String name) {
        super(id, name, "维护设备");
    }
}

// 采购专员类
public class Buyer extends AdminStaff {
    public Buyer(String id, String name) {
        super(id, name, "采购物资");
    }
}
