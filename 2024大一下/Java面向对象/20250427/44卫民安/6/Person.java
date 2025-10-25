// 人类
public class Person {
    private String name; // 姓名
    private int age; // 年龄

    // 无参构造
    public Person() {
    }

    // 有参构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 喂养宠物狗的方法
    public void keepPet(Dog dog, String something) {
        dog.eat(something);
    }

    // 喂养宠物猫的方法
    public void keepPet(Cat cat, String something) {
        cat.eat(something);
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
        return "姓名: " + name + ", 年龄: " + age;
    }
}