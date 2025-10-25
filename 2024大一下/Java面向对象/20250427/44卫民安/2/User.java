// 角色类(父类)
public class User {
    private String name; // 姓名
    private int age; // 年龄

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 查看课表的方法
    public void viewSchedule() {
        System.out.println("用户名: " + name + " 年龄: " + age + " 正在查看课表");
    }

    // Getter 和 Setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "用户名: " + name + ", 年龄: " + age;
    }
}