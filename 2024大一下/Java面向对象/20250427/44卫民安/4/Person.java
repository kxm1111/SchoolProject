// 人类
public class Person {
    protected String name; // 姓名
    protected String gender; // 性别
    protected int age; // 年龄
    protected String nationality; // 国籍

    // 无参构造
    public Person() {
    }

    // 有参构造
    public Person(String name, String gender, int age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    // 吃饭方法
    public void eat() {
        System.out.println(name + " 正在吃饭");
    }

    // 睡觉方法
    public void sleep() {
        System.out.println(name + " 正在睡觉");
    }

    // 工作方法（抽象方法）
    public void work() {
        System.out.println(name + " 正在工作");
    }
}