// 动物类
public class Animal {
    private int age; // 年龄
    private String color; // 颜色

    // 无参构造
    public Animal() {
    }

    // 有参构造
    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    // eat方法
    public void eat(String something) {
        System.out.println(color + "的" + age + "岁的动物，在吃" + something);
    }

    // Getter 和 Setter 方法
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "年龄: " + age + ", 颜色: " + color;
    }
}